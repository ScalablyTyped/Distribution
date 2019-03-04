package typings
package phonegapDashFacebookDashPluginLib.PhonegapFacebookPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * You can add the Feed Dialog to your app so people can publish individual stories to their timeline. This
  * includes captions that your app manages and a personal comment from the person sharing the content.
  *
  * For use with showDialog() of method type 'feed'.
  */
trait FeedDialogOptions extends BaseDialogOptions {
  /**
    * The caption of the link (appears beneath the link name). If not specified, this field is automatically
    * populated with the URL of the link.
    */
  var caption: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The description of the link (appears beneath the link caption). If not specified, this field is
    * automatically populated by information scraped from the link, typically the title of the page.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of the person posting the message. If this is unspecified, it defaults to the current person.
    * If specified, it must be the ID of the person or of a page that the person administers.
    */
  var from: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The link attached to this post.
    */
  var link: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the link attachment.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The URL of a picture attached to this post. The picture must be at least 200px by 200px.
    */
  var picture: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This argument is a comma-separated list, consisting of at most 5 distinct items, each of length at
    * least 1 and at most 15 characters drawn from the set
    * '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz_'.
    * Each category is used in Facebook Insights to help you measure the performance of different types
    * of post.
    */
  var ref: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The URL of a media file (either SWF or MP3) attached to this post. If SWF, you must also specify
    * 'picture' to provide a thumbnail for the video.
    */
  var source: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of the profile that this story will be published to. If this is unspecified, it defaults to
    * the value of from. The ID must be a friend who also uses your app.
    */
  var to: js.UndefOr[java.lang.String] = js.undefined
}

object FeedDialogOptions {
  @scala.inline
  def apply(
    method: java.lang.String,
    caption: java.lang.String = null,
    description: java.lang.String = null,
    from: java.lang.String = null,
    link: java.lang.String = null,
    name: java.lang.String = null,
    picture: java.lang.String = null,
    ref: java.lang.String = null,
    source: java.lang.String = null,
    to: java.lang.String = null
  ): FeedDialogOptions = {
    val __obj = js.Dynamic.literal(method = method)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (description != null) __obj.updateDynamic("description")(description)
    if (from != null) __obj.updateDynamic("from")(from)
    if (link != null) __obj.updateDynamic("link")(link)
    if (name != null) __obj.updateDynamic("name")(name)
    if (picture != null) __obj.updateDynamic("picture")(picture)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    if (source != null) __obj.updateDynamic("source")(source)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[FeedDialogOptions]
  }
}

