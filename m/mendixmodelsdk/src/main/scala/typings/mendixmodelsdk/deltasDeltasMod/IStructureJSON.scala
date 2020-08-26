package typings.mendixmodelsdk.deltasDeltasMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStructureJSON
  extends /* propertyName */ StringDictionary[
      PrimitiveValue | (js.Array[IStructureJSON | PrimitiveValue]) | IStructureJSON | Null
    ] {
  @JSName("$ID")
  var $ID: String = js.native
  @JSName("$Type")
  var $Type: String = js.native
}

object IStructureJSON {
  @scala.inline
  def apply($ID: String, $Type: String): IStructureJSON = {
    val __obj = js.Dynamic.literal($ID = $ID.asInstanceOf[js.Any], $Type = $Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStructureJSON]
  }
  @scala.inline
  implicit class IStructureJSONOps[Self <: IStructureJSON] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$ID(value: String): Self = this.set("$ID", value.asInstanceOf[js.Any])
    @scala.inline
    def set$Type(value: String): Self = this.set("$Type", value.asInstanceOf[js.Any])
  }
  
}

