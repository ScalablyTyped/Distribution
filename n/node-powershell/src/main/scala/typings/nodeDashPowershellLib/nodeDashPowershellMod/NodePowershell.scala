package typings
package nodeDashPowershellLib.nodeDashPowershellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodePowershell extends js.Object {
  /**
           * An array containing the command history ever added to the shell instance.
           */
  var history: js.Array[java.lang.String] = js.native
  /**
           * An object containing the sdtio (in,out,err) [stream.Readable] of the PowerShell Instance.
           */
  var streams: nodeDashPowershellLib.nodeDashPowershellMod.NodePowershellNs.ShellStream = js.native
  /**
           * Adds a command to the end of the pipeline of the shell object.
           * @param {string} required - PowerShell command - PowerShell script
           * @param {array} optional - {name: ‘’, value: ‘’} - {name: value} - ‘switch’
           * @returns Every command currently in the pipeline.
           */
  def addCommand(command: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  /**
           * Adds a command to the end of the pipeline of the shell object.
           * @param {string} required - PowerShell command - PowerShell script
           * @param {array} optional - {name: ‘’, value: ‘’} - {name: value} - ‘switch’
           * @returns Every command currently in the pipeline.
           */
  def addCommand(
    command: java.lang.String,
    params: js.Array[java.lang.String | org.scalablytyped.runtime.StringDictionary[java.lang.String]]
  ): js.Promise[js.Array[java.lang.String]] = js.native
  /**
           * Releases all resources used by the shell object and closes the PowerShell child_process.
           * @returns Promise with the error message.
           */
  def dispose(): js.Promise[java.lang.String] = js.native
  /**
           * Runs the commands of the shell object pipeline.
           * @returns Promise with the command output.
           */
  def invoke(): js.Promise[java.lang.String] = js.native
  /**
           * Listens to events emitted from the shell.
           * @param eventName required - Possible events:
           *  'output' - Emits when shell has an output.
           *  'err' - Emits when shell has an error.
           *  'end' - Emits when shell ends.
           * @param callback required - Callback function to be called when the event emits.
           */
  def on(eventName: java.lang.String, callback: js.Function1[/* output */ java.lang.String, scala.Unit]): scala.Unit = js.native
}

