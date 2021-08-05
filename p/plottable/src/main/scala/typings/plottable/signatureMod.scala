package typings.plottable

import org.scalablytyped.runtime.StringDictionary
import typings.plottable.datasetMod.Dataset
import typings.plottable.scaleMod.Scale
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signatureMod {
  
  @JSImport("plottable/build/src/memoize/signature", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("plottable/build/src/memoize/signature", "ArraySignature")
  @js.native
  class ArraySignature protected () extends Signature {
    def this(array: js.Array[Signature]) = this()
    
    /* private */ var array: js.Any = js.native
  }
  
  @JSImport("plottable/build/src/memoize/signature", "ObjectSignature")
  @js.native
  class ObjectSignature protected () extends Signature {
    def this(obj: ISignatureRecord) = this()
    
    /* private */ var obj: js.Any = js.native
  }
  
  @JSImport("plottable/build/src/memoize/signature", "ReferenceSignature")
  @js.native
  class ReferenceSignature protected () extends Signature {
    def this(ref: js.Any) = this()
    
    /* private */ var ref: js.Any = js.native
  }
  
  @JSImport("plottable/build/src/memoize/signature", "Signature")
  @js.native
  abstract class Signature () extends StObject {
    
    def isDifferent(other: Signature): Boolean = js.native
    
    /* protected */ def isSignatureDifferent(other: this.type): Boolean = js.native
  }
  
  inline def sign(a: js.Any): Signature = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(a.asInstanceOf[js.Any]).asInstanceOf[Signature]
  
  inline def signArray(a: js.Array[js.Any]): ArraySignature = ^.asInstanceOf[js.Dynamic].applyDynamic("signArray")(a.asInstanceOf[js.Any]).asInstanceOf[ArraySignature]
  
  inline def signDataset(dataset: Dataset): ObjectSignature = ^.asInstanceOf[js.Dynamic].applyDynamic("signDataset")(dataset.asInstanceOf[js.Any]).asInstanceOf[ObjectSignature]
  
  inline def signObj(obj: StringDictionary[js.Any]): ObjectSignature = ^.asInstanceOf[js.Dynamic].applyDynamic("signObj")(obj.asInstanceOf[js.Any]).asInstanceOf[ObjectSignature]
  
  inline def signRef(a: js.Any): ReferenceSignature = ^.asInstanceOf[js.Dynamic].applyDynamic("signRef")(a.asInstanceOf[js.Any]).asInstanceOf[ReferenceSignature]
  
  inline def signScale(scale: Scale[js.Any, js.Any]): ObjectSignature = ^.asInstanceOf[js.Dynamic].applyDynamic("signScale")(scale.asInstanceOf[js.Any]).asInstanceOf[ObjectSignature]
  
  type ISignatureRecord = Record[String, Signature]
}
