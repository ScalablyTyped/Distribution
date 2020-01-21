package typings.officeUiFabricReact.keytipConfigMod

import typings.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeytipConfigItem extends js.Object {
  /**
    * Children keytips of this keytip
    */
  var children: js.UndefOr[js.Array[IKeytipConfigItem]] = js.undefined
  /**
    * Content for the keytip
    */
  var content: String
  /**
    * Identifier for the keytip, to be used to access in the configMap
    */
  var id: String
  /**
    * Optional props in IKeytipProps
    */
  var optionalProps: js.UndefOr[Partial[IKeytipProps]] = js.undefined
  /**
    * Key Sequence for this keytip only
    * If sequence is not defined it will be derived from the content string
    */
  var sequence: js.UndefOr[String] = js.undefined
}

object IKeytipConfigItem {
  @scala.inline
  def apply(
    content: String,
    id: String,
    children: js.Array[IKeytipConfigItem] = null,
    optionalProps: Partial[IKeytipProps] = null,
    sequence: String = null
  ): IKeytipConfigItem = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (optionalProps != null) __obj.updateDynamic("optionalProps")(optionalProps.asInstanceOf[js.Any])
    if (sequence != null) __obj.updateDynamic("sequence")(sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeytipConfigItem]
  }
}

