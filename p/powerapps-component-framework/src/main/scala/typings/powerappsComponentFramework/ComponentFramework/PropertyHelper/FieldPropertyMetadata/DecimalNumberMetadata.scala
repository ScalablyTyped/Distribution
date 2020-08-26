package typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata

import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.ImeMode
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.RequiredLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecimalNumberMetadata extends NumberMetadata {
  var Precision: Double = js.native
}

object DecimalNumberMetadata {
  @scala.inline
  def apply(
    Description: String,
    DisplayName: String,
    ImeMode: ImeMode,
    IsSecured: Boolean,
    LogicalName: String,
    MaxValue: Double,
    MinValue: Double,
    Precision: Double,
    RequiredLevel: RequiredLevel,
    SourceType: Double
  ): DecimalNumberMetadata = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], ImeMode = ImeMode.asInstanceOf[js.Any], IsSecured = IsSecured.asInstanceOf[js.Any], LogicalName = LogicalName.asInstanceOf[js.Any], MaxValue = MaxValue.asInstanceOf[js.Any], MinValue = MinValue.asInstanceOf[js.Any], Precision = Precision.asInstanceOf[js.Any], RequiredLevel = RequiredLevel.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecimalNumberMetadata]
  }
  @scala.inline
  implicit class DecimalNumberMetadataOps[Self <: DecimalNumberMetadata] (val x: Self) extends AnyVal {
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
    def setPrecision(value: Double): Self = this.set("Precision", value.asInstanceOf[js.Any])
  }
  
}

