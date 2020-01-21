package typings.octokitRest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDate extends js.Object {
  var date: String
  var etag: String
  var `last-modified`: String
  var link: String
  var status: String
  var `x-Octokit-media-type`: String
  var `x-Octokit-request-id`: String
  var `x-ratelimit-limit`: String
  var `x-ratelimit-remaining`: String
  var `x-ratelimit-reset`: String
}

object AnonDate {
  @scala.inline
  def apply(
    date: String,
    etag: String,
    `last-modified`: String,
    link: String,
    status: String,
    `x-Octokit-media-type`: String,
    `x-Octokit-request-id`: String,
    `x-ratelimit-limit`: String,
    `x-ratelimit-remaining`: String,
    `x-ratelimit-reset`: String
  ): AnonDate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("last-modified")(`last-modified`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-Octokit-media-type")(`x-Octokit-media-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-Octokit-request-id")(`x-Octokit-request-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-ratelimit-limit")(`x-ratelimit-limit`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-ratelimit-remaining")(`x-ratelimit-remaining`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-ratelimit-reset")(`x-ratelimit-reset`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDate]
  }
}

