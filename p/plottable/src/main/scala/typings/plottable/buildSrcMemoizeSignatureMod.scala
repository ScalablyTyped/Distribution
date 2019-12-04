package typings.plottable

import org.scalablytyped.runtime.StringDictionary
import typings.plottable.buildSrcCoreDatasetMod.Dataset
import typings.plottable.buildSrcMemoizeSignatureMod.ArraySignature
import typings.plottable.buildSrcMemoizeSignatureMod.ISignatureRecord
import typings.plottable.buildSrcMemoizeSignatureMod.ObjectSignature
import typings.plottable.buildSrcMemoizeSignatureMod.ReferenceSignature
import typings.plottable.buildSrcMemoizeSignatureMod.Signature
import typings.plottable.buildSrcScalesScaleMod.Scale
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/memoize/signature", JSImport.Namespace)
@js.native
object buildSrcMemoizeSignatureMod extends js.Object {
  @js.native
  class ArraySignature protected () extends Signature {
    def this(array: js.Array[Signature]) = this()
    var array: js.Any = js.native
    /**
      * An array of signatures is different if any of the elements isDifferent.
      */
    def isSignatureDifferent(other: ArraySignature): Boolean = js.native
  }
  
  @js.native
  class ObjectSignature protected () extends Signature {
    def this(obj: ISignatureRecord) = this()
    var obj: js.Any = js.native
    /**
      * An object signature is different if any of the elements isDifferent.
      */
    def isSignatureDifferent(other: ObjectSignature): Boolean = js.native
  }
  
  @js.native
  class ReferenceSignature protected () extends Signature {
    def this(ref: js.Any) = this()
    var ref: js.Any = js.native
    def isSignatureDifferent(other: ReferenceSignature): Boolean = js.native
  }
  
  @js.native
  abstract class Signature () extends js.Object {
    def isDifferent(other: Signature): Boolean = js.native
    /* protected */ def isSignatureDifferent(other: this.type): Boolean = js.native
  }
  
  def sign(a: js.Any): Signature = js.native
  def signArray(a: js.Array[_]): ArraySignature = js.native
  def signDataset(dataset: Dataset): ObjectSignature = js.native
  def signObj(obj: StringDictionary[js.Any]): ObjectSignature = js.native
  def signRef(a: js.Any): ReferenceSignature = js.native
  def signScale(scale: Scale[_, _]): ObjectSignature = js.native
  type ISignatureRecord = Record[String, Signature]
}

