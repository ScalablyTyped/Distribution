package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsGetResponseFiles extends js.Object {
  var `hello_world.py`: GistsGetResponseFilesHelloWorldPy
  var `hello_world.rb`: GistsGetResponseFilesHelloWorldRb
  var `hello_world_python.txt`: GistsGetResponseFilesHelloWorldPythonTxt
  var `hello_world_ruby.txt`: GistsGetResponseFilesHelloWorldRubyTxt
}

object GistsGetResponseFiles {
  @scala.inline
  def apply(
    `hello_world.py`: GistsGetResponseFilesHelloWorldPy,
    `hello_world.rb`: GistsGetResponseFilesHelloWorldRb,
    `hello_world_python.txt`: GistsGetResponseFilesHelloWorldPythonTxt,
    `hello_world_ruby.txt`: GistsGetResponseFilesHelloWorldRubyTxt
  ): GistsGetResponseFiles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hello_world.py")(`hello_world.py`)
    __obj.updateDynamic("hello_world.rb")(`hello_world.rb`)
    __obj.updateDynamic("hello_world_python.txt")(`hello_world_python.txt`)
    __obj.updateDynamic("hello_world_ruby.txt")(`hello_world_ruby.txt`)
    __obj.asInstanceOf[GistsGetResponseFiles]
  }
}

