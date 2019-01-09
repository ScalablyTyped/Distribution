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
    * Will handle UNC paths, normalizes windows drive letters to lower-case, and uses the
    * platform specific path separator.
    *
    * * Will *not* validate the path for invalid characters and semantics.
    * * Will *not* look at the scheme of this Uri.
    * * The result shall *not* be used for display purposes but for accessing a file on disk.
    *
    *
    * The *difference* to `Uri#path` is the use of the platform specific separator and the handling
    * of UNC paths. See the below sample of a file-uri with an authority (UNC path).
    *
    * ```ts
    const u = Uri.parse('file://server/c$/folder/file.txt')
    u.authority === 'server'
    u.path === '/shares/c$/file.txt'
    u.fsPath === '\\server\c$\folder\file.txt'
    ```
    *
    * Using `Uri#path` to read a file (using fs-apis) would not be enough because parts of the path,
    * namely the server name, would be missing. Therefore `Uri#fsPath` exists - it's sugar to ease working
    * with URIs that represent files on disk (`file` scheme).
    */
  val fsPath: java.lang.String = js.native
  /* CompleteClass */
  override var path: java.lang.String = js.native
  /* CompleteClass */
  override var query: java.lang.String = js.native
  /* CompleteClass */
  override var scheme: java.lang.String = js.native
  def toJSON(): js.Object = js.native
  def toString(skipEncoding: scala.Boolean): java.lang.String = js.native
  def `with`(change: monacoDashEditorLib.Anon_Authority): Uri = js.native
}

@JSImport("monaco-editor", "Uri")
@js.native
object Uri extends js.Object {
  /**
    * Creates a new Uri from a file system path, e.g. `c:\my\files`,
    * `/usr/home`, or `\\server\share\some\path`.
    *
    * The *difference* between `Uri#parse` and `Uri#file` is that the latter treats the argument
    * as path, not as stringified-uri. E.g. `Uri.file(path)` is **not the same as**
    * `Uri.parse('file://' + path)` because the path might contain characters that are
    * interpreted (# and ?). See the following sample:
    * ```ts
    const good = Uri.file('/coding/c#/project1');
    good.scheme === 'file';
    good.path === '/coding/c#/project1';
    good.fragment === '';
    const bad = Uri.parse('file://' + '/coding/c#/project1');
    bad.scheme === 'file';
    bad.path === '/coding/c'; // path is now broken
    bad.fragment === '/project1';
    ```
    *
    * @param path A file system path (see `Uri#fsPath`)
    */
  def file(path: java.lang.String): monacoDashEditorLib.monacoDashEditorMod.Uri = js.native
  def from(components: monacoDashEditorLib.Anon_AuthorityFragment): monacoDashEditorLib.monacoDashEditorMod.Uri = js.native
  def isUri(thing: js.Any): /* is monaco-editor.monaco-editor.Uri */ scala.Boolean = js.native
  /**
    * Creates a new Uri from a string, e.g. `http://www.msft.com/some/path`,
    * `file:///usr/home`, or `scheme:with/path`.
    *
    * @param value A string which represents an Uri (see `Uri#toString`).
    */
  def parse(value: java.lang.String): monacoDashEditorLib.monacoDashEditorMod.Uri = js.native
  def revive(data: js.Any): monacoDashEditorLib.monacoDashEditorMod.Uri = js.native
  def revive(data: monacoDashEditorLib.monacoDashEditorMod.UriComponents): monacoDashEditorLib.monacoDashEditorMod.Uri = js.native
}

