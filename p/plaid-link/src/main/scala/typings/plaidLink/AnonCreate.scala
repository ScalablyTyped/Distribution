package typings.plaidLink

import typings.plaidLink.mod.Plaid.CreateConfig
import typings.plaidLink.mod.Plaid.LinkHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreate extends js.Object {
  var version: String
  def create(params: CreateConfig): LinkHandler
}

object AnonCreate {
  @scala.inline
  def apply(create: CreateConfig => LinkHandler, version: String): AnonCreate = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCreate]
  }
}

