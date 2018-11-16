package typings
package monacoDashEditorLib.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "Uri")
@js.native
class Uri () extends UriComponents {
  /* CompleteClass */
  override var authority: java.lang.String = js.native
  /* CompleteClass */
  override var fragment: java.lang.String = js.native
  /**
       * Returns a string representing the corresponding file system path of this Uri.
       * Will handle UNC paths and normalize windows drive letters to lower-case. Also
       * uses the platform specific path separator. Will *not* validate the path for
       * invalid characters and semantics. Will *not* look at the scheme of this Uri.
       */
  val fsPath: java.lang.String = js.native
  /* CompleteClass */
  override var path: java.lang.String = js.native
  /* CompleteClass */
  override var query: java.lang.String = js.native
  /* CompleteClass */
  override var scheme: java.lang.String = js.native
  def toJSON(): js.Object = js.native
  /**
       *
       * @param skipEncoding Do not encode the result, default is `false`
       */
  def toString(skipEncoding: scala.Boolean): java.lang.String = js.native
  def `with`(change: monacoDashEditorLib.Anon_Path): Uri = js.native
}

@JSImport("monaco-editor", "Uri")
@js.native
object Uri extends js.Object {
  def file(path: java.lang.String): monacoDashEditorLib.monacoDashEditorMod.Uri = js.native
  def from(components: monacoDashEditorLib.Anon_Path): monacoDashEditorLib.monacoDashEditorMod.Uri = js.native
  def isUri(thing: js.Any): /* is Uri */scala.Boolean = js.native
  def parse(value: java.lang.String): monacoDashEditorLib.monacoDashEditorMod.Uri = js.native
  def revive(data: js.Any): monacoDashEditorLib.monacoDashEditorMod.Uri = js.native
  def revive(data: monacoDashEditorLib.monacoDashEditorMod.UriComponents): monacoDashEditorLib.monacoDashEditorMod.Uri = js.native
}

