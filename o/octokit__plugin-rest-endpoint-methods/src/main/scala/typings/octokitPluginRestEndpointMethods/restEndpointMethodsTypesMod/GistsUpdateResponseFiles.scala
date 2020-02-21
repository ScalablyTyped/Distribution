package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsUpdateResponseFiles extends js.Object {
  @JSName("hello_world.md")
  var hello_worldDotmd: GistsUpdateResponseFilesHelloWorldMd
  @JSName("hello_world.py")
  var hello_worldDotpy: GistsUpdateResponseFilesHelloWorldPy
  @JSName("hello_world.rb")
  var hello_worldDotrb: GistsUpdateResponseFilesHelloWorldRb
  @JSName("new_file.txt")
  var new_fileDottxt: GistsUpdateResponseFilesNewFileTxt
}

object GistsUpdateResponseFiles {
  @scala.inline
  def apply(
    hello_worldDotmd: GistsUpdateResponseFilesHelloWorldMd,
    hello_worldDotpy: GistsUpdateResponseFilesHelloWorldPy,
    hello_worldDotrb: GistsUpdateResponseFilesHelloWorldRb,
    new_fileDottxt: GistsUpdateResponseFilesNewFileTxt
  ): GistsUpdateResponseFiles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hello_world.md")(hello_worldDotmd.asInstanceOf[js.Any])
    __obj.updateDynamic("hello_world.py")(hello_worldDotpy.asInstanceOf[js.Any])
    __obj.updateDynamic("hello_world.rb")(hello_worldDotrb.asInstanceOf[js.Any])
    __obj.updateDynamic("new_file.txt")(new_fileDottxt.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsUpdateResponseFiles]
  }
}

