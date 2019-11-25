package typings.mendixmodelsdk.distSdkInternalTransportInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstractElementJson
  extends IStructureJson
     with /* key */ StringDictionary[js.Any]

object IAbstractElementJson {
  @scala.inline
  def apply($ID: String, $Type: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): IAbstractElementJson = {
    val __obj = js.Dynamic.literal($ID = $ID.asInstanceOf[js.Any], $Type = $Type.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IAbstractElementJson]
  }
}

