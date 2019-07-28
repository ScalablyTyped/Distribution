package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsUpdateResponseFiles extends js.Object {
  var `hello_world.md`: GistsUpdateResponseFilesHelloWorldMd
  var `hello_world.py`: GistsUpdateResponseFilesHelloWorldPy
  var `hello_world.rb`: GistsUpdateResponseFilesHelloWorldRb
  var `new_file.txt`: GistsUpdateResponseFilesNewFileTxt
}

object GistsUpdateResponseFiles {
  @scala.inline
  def apply(
    `hello_world.md`: GistsUpdateResponseFilesHelloWorldMd,
    `hello_world.py`: GistsUpdateResponseFilesHelloWorldPy,
    `hello_world.rb`: GistsUpdateResponseFilesHelloWorldRb,
    `new_file.txt`: GistsUpdateResponseFilesNewFileTxt
  ): GistsUpdateResponseFiles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hello_world.md")(`hello_world.md`)
    __obj.updateDynamic("hello_world.py")(`hello_world.py`)
    __obj.updateDynamic("hello_world.rb")(`hello_world.rb`)
    __obj.updateDynamic("new_file.txt")(`new_file.txt`)
    __obj.asInstanceOf[GistsUpdateResponseFiles]
  }
}

