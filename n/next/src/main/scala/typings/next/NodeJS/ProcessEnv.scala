package typings.next.NodeJS

import typings.next.nextStrings.development
import typings.next.nextStrings.production
import typings.next.nextStrings.test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessEnv extends js.Object {
  val NODE_ENV: development | production | test
}

object ProcessEnv {
  @scala.inline
  def apply(NODE_ENV: development | production | test): ProcessEnv = {
    val __obj = js.Dynamic.literal(NODE_ENV = NODE_ENV.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessEnv]
  }
}

