package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a new album.
  */
trait INewAlbum extends js.Object {
  /**
    * A description of the album.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the album.
    */
  var name: java.lang.String
}

object INewAlbum {
  @scala.inline
  def apply(name: java.lang.String, description: java.lang.String = null): INewAlbum = {
    val __obj = js.Dynamic.literal(name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[INewAlbum]
  }
}

