package typings.podcast

import typings.podcast.Anon_FeedUrl
import typings.podcast.Anon_Feedurl
import typings.podcast.Anon_ImageUrl
import typings.podcast.Anon_Imageurl
import typings.podcast.Anon_SiteUrl
import typings.podcast.Anon_Siteurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object podcastMod {
  type FeedOptions = BaseFeedOptions with (Anon_FeedUrl | Anon_Feedurl) with (Anon_SiteUrl | Anon_Siteurl) with (Anon_ImageUrl | Anon_Imageurl)
}
