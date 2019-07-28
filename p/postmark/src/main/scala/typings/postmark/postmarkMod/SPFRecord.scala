package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SPFRecord extends js.Object {
  var SPFHost: String
  var SPFTextValue: String
  var SPFVerified: Boolean
}

object SPFRecord {
  @scala.inline
  def apply(SPFHost: String, SPFTextValue: String, SPFVerified: Boolean): SPFRecord = {
    val __obj = js.Dynamic.literal(SPFHost = SPFHost, SPFTextValue = SPFTextValue, SPFVerified = SPFVerified)
  
    __obj.asInstanceOf[SPFRecord]
  }
}

