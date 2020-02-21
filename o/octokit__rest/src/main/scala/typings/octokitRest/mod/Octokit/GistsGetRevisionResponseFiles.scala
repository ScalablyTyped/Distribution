package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsGetRevisionResponseFiles extends js.Object {
  @JSName("hello_world.py")
  var hello_worldDotpy: GistsGetRevisionResponseFilesHelloWorldPy
  @JSName("hello_world.rb")
  var hello_worldDotrb: GistsGetRevisionResponseFilesHelloWorldRb
  @JSName("hello_world_python.txt")
  var hello_world_pythonDottxt: GistsGetRevisionResponseFilesHelloWorldPythonTxt
  @JSName("hello_world_ruby.txt")
  var hello_world_rubyDottxt: GistsGetRevisionResponseFilesHelloWorldRubyTxt
}

object GistsGetRevisionResponseFiles {
  @scala.inline
  def apply(
    hello_worldDotpy: GistsGetRevisionResponseFilesHelloWorldPy,
    hello_worldDotrb: GistsGetRevisionResponseFilesHelloWorldRb,
    hello_world_pythonDottxt: GistsGetRevisionResponseFilesHelloWorldPythonTxt,
    hello_world_rubyDottxt: GistsGetRevisionResponseFilesHelloWorldRubyTxt
  ): GistsGetRevisionResponseFiles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hello_world.py")(hello_worldDotpy.asInstanceOf[js.Any])
    __obj.updateDynamic("hello_world.rb")(hello_worldDotrb.asInstanceOf[js.Any])
    __obj.updateDynamic("hello_world_python.txt")(hello_world_pythonDottxt.asInstanceOf[js.Any])
    __obj.updateDynamic("hello_world_ruby.txt")(hello_world_rubyDottxt.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsGetRevisionResponseFiles]
  }
}

