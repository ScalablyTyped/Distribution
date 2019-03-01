package typings
package mendixmodelsdkLib.distSdkInternalDeltasDeltasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStructureJSON
  extends /* propertyName */ org.scalablytyped.runtime.StringDictionary[
      PrimitiveValue | js.Array[PrimitiveValue] | IStructureJSON | js.Array[IStructureJSON] | scala.Null
    ] {
  @JSName("$ID")
  var $ID: java.lang.String
  @JSName("$Type")
  var $Type: java.lang.String
}

object IStructureJSON {
  @scala.inline
  def apply(
    $ID: java.lang.String,
    $Type: java.lang.String,
    StringDictionary: /* propertyName */ org.scalablytyped.runtime.StringDictionary[
      PrimitiveValue | js.Array[PrimitiveValue] | IStructureJSON | js.Array[IStructureJSON] | scala.Null
    ] = null
  ): IStructureJSON = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$ID")($ID)
    __obj.updateDynamic("$Type")($Type)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IStructureJSON]
  }
}

