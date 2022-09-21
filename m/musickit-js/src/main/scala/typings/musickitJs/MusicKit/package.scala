package typings.musickitJs.MusicKit

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * The rating of the content that potentially plays while playing a resource.
  * A nil value means no rating is available for this resource.
  * https://developer.apple.com/documentation/musickit/contentrating
  */
/* Rewritten from type alias, can be one of: 
  - typings.musickitJs.musickitJsStrings.clean
  - typings.musickitJs.musickitJsStrings.explicit
  - scala.Null
*/
type ContentRating = _ContentRating | Null

/**
  * This property describes a media item.
  */
type Descriptor = MediaItem | String

type MediaItemPosition = Double

/**
  * An object that represents a unique identifier for a music item.
  * https://developer.apple.com/documentation/musickit/musicitemid
  */
type MusicItemID = String

type QueryParameters = Record[String, Any]
