package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsCreateResponseFiles extends js.Object {
  @JSName("hello_world.py")
  var hello_worldDotpy: GistsCreateResponseFilesHelloWorldPy
  @JSName("hello_world.rb")
  var hello_worldDotrb: GistsCreateResponseFilesHelloWorldRb
  @JSName("hello_world_python.txt")
  var hello_world_pythonDottxt: GistsCreateResponseFilesHelloWorldPythonTxt
  @JSName("hello_world_ruby.txt")
  var hello_world_rubyDottxt: GistsCreateResponseFilesHelloWorldRubyTxt
}

object GistsCreateResponseFiles {
  @scala.inline
  def apply(
    hello_worldDotpy: GistsCreateResponseFilesHelloWorldPy,
    hello_worldDotrb: GistsCreateResponseFilesHelloWorldRb,
    hello_world_pythonDottxt: GistsCreateResponseFilesHelloWorldPythonTxt,
    hello_world_rubyDottxt: GistsCreateResponseFilesHelloWorldRubyTxt
  ): GistsCreateResponseFiles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hello_world.py")(hello_worldDotpy.asInstanceOf[js.Any])
    __obj.updateDynamic("hello_world.rb")(hello_worldDotrb.asInstanceOf[js.Any])
    __obj.updateDynamic("hello_world_python.txt")(hello_world_pythonDottxt.asInstanceOf[js.Any])
    __obj.updateDynamic("hello_world_ruby.txt")(hello_world_rubyDottxt.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsCreateResponseFiles]
  }
}

