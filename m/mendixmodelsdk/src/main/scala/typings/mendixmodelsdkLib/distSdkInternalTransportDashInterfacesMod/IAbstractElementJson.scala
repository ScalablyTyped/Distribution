package typings
package mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstractElementJson
  extends IStructureJson
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object IAbstractElementJson {
  @scala.inline
  def apply(
    $ID: java.lang.String,
    $Type: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): IAbstractElementJson = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$ID")($ID)
    __obj.updateDynamic("$Type")($Type)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IAbstractElementJson]
  }
}

