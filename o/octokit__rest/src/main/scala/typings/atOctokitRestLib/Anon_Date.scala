package typings
package atOctokitRestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Date extends js.Object {
  var date: java.lang.String
  var etag: java.lang.String
  var `last-modified`: java.lang.String
  var link: java.lang.String
  var status: java.lang.String
  var `x-Octokit-media-type`: java.lang.String
  var `x-Octokit-request-id`: java.lang.String
  var `x-ratelimit-limit`: java.lang.String
  var `x-ratelimit-remaining`: java.lang.String
  var `x-ratelimit-reset`: java.lang.String
}

object Anon_Date {
  @scala.inline
  def apply(
    date: java.lang.String,
    etag: java.lang.String,
    `last-modified`: java.lang.String,
    link: java.lang.String,
    status: java.lang.String,
    `x-Octokit-media-type`: java.lang.String,
    `x-Octokit-request-id`: java.lang.String,
    `x-ratelimit-limit`: java.lang.String,
    `x-ratelimit-remaining`: java.lang.String,
    `x-ratelimit-reset`: java.lang.String
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

