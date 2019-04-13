package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsGetRevisionResponseFiles extends js.Object {
  var `hello_world.py`: GistsGetRevisionResponseFilesHelloWorldPy
  var `hello_world.rb`: GistsGetRevisionResponseFilesHelloWorldRb
  var `hello_world_python.txt`: GistsGetRevisionResponseFilesHelloWorldPythonTxt
  var `hello_world_ruby.txt`: GistsGetRevisionResponseFilesHelloWorldRubyTxt
}

object GistsGetRevisionResponseFiles {
  @scala.inline
  def apply(
    `hello_world.py`: GistsGetRevisionResponseFilesHelloWorldPy,
    `hello_world.rb`: GistsGetRevisionResponseFilesHelloWorldRb,
    `hello_world_python.txt`: GistsGetRevisionResponseFilesHelloWorldPythonTxt,
    `hello_world_ruby.txt`: GistsGetRevisionResponseFilesHelloWorldRubyTxt
  ): GistsGetRevisionResponseFiles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hello_world.py")(`hello_world.py`)
    __obj.updateDynamic("hello_world.rb")(`hello_world.rb`)
    __obj.updateDynamic("hello_world_python.txt")(`hello_world_python.txt`)
    __obj.updateDynamic("hello_world_ruby.txt")(`hello_world_ruby.txt`)
    __obj.asInstanceOf[GistsGetRevisionResponseFiles]
  }
}

