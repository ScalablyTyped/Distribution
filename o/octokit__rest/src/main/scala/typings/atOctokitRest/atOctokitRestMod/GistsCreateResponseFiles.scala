package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsCreateResponseFiles extends js.Object {
  var `hello_world.py`: GistsCreateResponseFilesHelloWorldPy
  var `hello_world.rb`: GistsCreateResponseFilesHelloWorldRb
  var `hello_world_python.txt`: GistsCreateResponseFilesHelloWorldPythonTxt
  var `hello_world_ruby.txt`: GistsCreateResponseFilesHelloWorldRubyTxt
}

object GistsCreateResponseFiles {
  @scala.inline
  def apply(
    `hello_world.py`: GistsCreateResponseFilesHelloWorldPy,
    `hello_world.rb`: GistsCreateResponseFilesHelloWorldRb,
    `hello_world_python.txt`: GistsCreateResponseFilesHelloWorldPythonTxt,
    `hello_world_ruby.txt`: GistsCreateResponseFilesHelloWorldRubyTxt
  ): GistsCreateResponseFiles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hello_world.py")(`hello_world.py`)
    __obj.updateDynamic("hello_world.rb")(`hello_world.rb`)
    __obj.updateDynamic("hello_world_python.txt")(`hello_world_python.txt`)
    __obj.updateDynamic("hello_world_ruby.txt")(`hello_world_ruby.txt`)
    __obj.asInstanceOf[GistsCreateResponseFiles]
  }
}

