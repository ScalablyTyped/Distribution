package typings.microsoftDashLiveDashConnect.Microsoft.Live

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
  var description: js.UndefOr[String] = js.undefined
  /**
    * The name of the album.
    */
  var name: String
}

object INewAlbum {
  @scala.inline
  def apply(name: String, description: String = null): INewAlbum = {
    val __obj = js.Dynamic.literal(name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[INewAlbum]
  }
}

