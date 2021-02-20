package typings.plottable

import org.scalablytyped.runtime.StringDictionary
import typings.plottable.datasetMod.Dataset
import typings.plottable.scaleMod.Scale
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signatureMod {
  
  @JSImport("plottable/build/src/memoize/signature", "ArraySignature")
  @js.native
  class ArraySignature protected () extends Signature {
    def this(array: js.Array[Signature]) = this()
    
    var array: js.Any = js.native
    
    /**
      * An array of signatures is different if any of the elements isDifferent.
      */
    def isSignatureDifferent(other: ArraySignature): Boolean = js.native
  }
  
  @JSImport("plottable/build/src/memoize/signature", "ObjectSignature")
  @js.native
  class ObjectSignature protected () extends Signature {
    def this(obj: ISignatureRecord) = this()
    
    /**
      * An object signature is different if any of the elements isDifferent.
      */
    def isSignatureDifferent(other: ObjectSignature): Boolean = js.native
    
    var obj: js.Any = js.native
  }
  
  @JSImport("plottable/build/src/memoize/signature", "ReferenceSignature")
  @js.native
  class ReferenceSignature protected () extends Signature {
    def this(ref: js.Any) = this()
    
    def isSignatureDifferent(other: ReferenceSignature): Boolean = js.native
    
    var ref: js.Any = js.native
  }
  
  @JSImport("plottable/build/src/memoize/signature", "Signature")
  @js.native
  abstract class Signature () extends StObject {
    
    def isDifferent(other: Signature): Boolean = js.native
    
    /* protected */ def isSignatureDifferent(other: this.type): Boolean = js.native
  }
  
  @JSImport("plottable/build/src/memoize/signature", "sign")
  @js.native
  def sign(a: js.Any): Signature = js.native
  
  @JSImport("plottable/build/src/memoize/signature", "signArray")
  @js.native
  def signArray(a: js.Array[_]): ArraySignature = js.native
  
  @JSImport("plottable/build/src/memoize/signature", "signDataset")
  @js.native
  def signDataset(dataset: Dataset): ObjectSignature = js.native
  
  @JSImport("plottable/build/src/memoize/signature", "signObj")
  @js.native
  def signObj(obj: StringDictionary[js.Any]): ObjectSignature = js.native
  
  @JSImport("plottable/build/src/memoize/signature", "signRef")
  @js.native
  def signRef(a: js.Any): ReferenceSignature = js.native
  
  @JSImport("plottable/build/src/memoize/signature", "signScale")
  @js.native
  def signScale(scale: Scale[_, _]): ObjectSignature = js.native
  
  type ISignatureRecord = Record[String, Signature]
}
