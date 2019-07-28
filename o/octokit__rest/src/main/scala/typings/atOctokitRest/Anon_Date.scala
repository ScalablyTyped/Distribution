package typings.atOctokitRest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Date extends js.Object {
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

object Anon_Date {
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
  ): Anon_Date = {
    val __obj = js.Dynamic.literal(date = date, etag = etag, link = link, status = status)
    __obj.updateDynamic("last-modified")(`last-modified`)
    __obj.updateDynamic("x-Octokit-media-type")(`x-Octokit-media-type`)
    __obj.updateDynamic("x-Octokit-request-id")(`x-Octokit-request-id`)
    __obj.updateDynamic("x-ratelimit-limit")(`x-ratelimit-limit`)
    __obj.updateDynamic("x-ratelimit-remaining")(`x-ratelimit-remaining`)
    __obj.updateDynamic("x-ratelimit-reset")(`x-ratelimit-reset`)
    __obj.asInstanceOf[Anon_Date]
  }
}

