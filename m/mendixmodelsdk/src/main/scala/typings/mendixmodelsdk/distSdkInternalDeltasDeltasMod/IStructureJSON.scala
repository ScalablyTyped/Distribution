package typings.mendixmodelsdk.distSdkInternalDeltasDeltasMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStructureJSON
  extends /* propertyName */ StringDictionary[
      PrimitiveValue | (js.Array[IStructureJSON | PrimitiveValue]) | IStructureJSON | Null
    ] {
  @JSName("$ID")
  var $ID: String
  @JSName("$Type")
  var $Type: String
}

object IStructureJSON {
  @scala.inline
  def apply(
    $ID: String,
    $Type: String,
    StringDictionary: /* propertyName */ StringDictionary[
      PrimitiveValue | (js.Array[IStructureJSON | PrimitiveValue]) | IStructureJSON | Null
    ] = null
  ): IStructureJSON = {
    val __obj = js.Dynamic.literal($ID = $ID.asInstanceOf[js.Any], $Type = $Type.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IStructureJSON]
  }
}

