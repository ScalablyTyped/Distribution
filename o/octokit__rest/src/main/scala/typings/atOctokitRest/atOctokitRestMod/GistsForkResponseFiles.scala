package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsForkResponseFiles extends js.Object {
  var `hello_world.rb`: GistsForkResponseFilesHelloWorldRb
}

object GistsForkResponseFiles {
  @scala.inline
  def apply(`hello_world.rb`: GistsForkResponseFilesHelloWorldRb): GistsForkResponseFiles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hello_world.rb")(`hello_world.rb`)
    __obj.asInstanceOf[GistsForkResponseFiles]
  }
}

