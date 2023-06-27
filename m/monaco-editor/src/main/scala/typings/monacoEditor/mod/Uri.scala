package typings.monacoEditor.mod

import typings.monacoEditor.anon.Authority
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monaco-editor", "Uri")
@js.native
open class Uri ()
  extends StObject
     with UriComponents {
  
  /**
    * authority is the 'www.example.com' part of 'http://www.example.com/some/path?query#fragment'.
    * The part between the first double slashes and the next slash.
    */
  @JSName("authority")
  val authority_Uri: String = js.native
  
  /**
    * fragment is the 'fragment' part of 'http://www.example.com/some/path?query#fragment'.
    */
  @JSName("fragment")
  val fragment_Uri: String = js.native
  
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
  def fsPath: String = js.native
  
  /**
    * path is the '/some/path' part of 'http://www.example.com/some/path?query#fragment'.
    */
  @JSName("path")
  val path_Uri: String = js.native
  
  /**
    * query is the 'query' part of 'http://www.example.com/some/path?query#fragment'.
    */
  @JSName("query")
  val query_Uri: String = js.native
  
  /* CompleteClass */
  var scheme: String = js.native
  
  def toJSON(): UriComponents = js.native
  
  def toString(skipEncoding: Boolean): String = js.native
  
  def `with`(change: Authority): Uri = js.native
}
/* static members */
object Uri {
  
  @JSImport("monaco-editor", "Uri")
  @js.native
  val ^ : js.Any = js.native
  
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
  inline def file(path: String): Uri = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(path.asInstanceOf[js.Any]).asInstanceOf[Uri]
  
  /**
    * Creates new Uri from uri components.
    *
    * Unless `strict` is `true` the scheme is defaults to be `file`. This function performs
    * validation and should be used for untrusted uri components retrieved from storage,
    * user input, command arguments etc
    */
  inline def from(components: UriComponents): Uri = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(components.asInstanceOf[js.Any]).asInstanceOf[Uri]
  inline def from(components: UriComponents, strict: Boolean): Uri = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(components.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Uri]
  
  inline def isUri(thing: Any): /* is monaco-editor.monaco-editor.Uri */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUri")(thing.asInstanceOf[js.Any]).asInstanceOf[/* is monaco-editor.monaco-editor.Uri */ Boolean]
  
  /**
    * Join a Uri path with path fragments and normalizes the resulting path.
    *
    * @param uri The input Uri.
    * @param pathFragment The path fragment to add to the Uri path.
    * @returns The resulting Uri.
    */
  inline def joinPath(uri: Uri, pathFragment: String*): Uri = ^.asInstanceOf[js.Dynamic].applyDynamic("joinPath")(scala.List(uri.asInstanceOf[js.Any]).`++`(pathFragment.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Uri]
  
  /**
    * Creates a new Uri from a string, e.g. `http://www.example.com/some/path`,
    * `file:///usr/home`, or `scheme:with/path`.
    *
    * @param value A string which represents an Uri (see `Uri#toString`).
    */
  inline def parse(value: String): Uri = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(value.asInstanceOf[js.Any]).asInstanceOf[Uri]
  inline def parse(value: String, _strict: Boolean): Uri = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(value.asInstanceOf[js.Any], _strict.asInstanceOf[js.Any])).asInstanceOf[Uri]
  
  inline def revive(): js.UndefOr[Uri] = ^.asInstanceOf[js.Dynamic].applyDynamic("revive")().asInstanceOf[js.UndefOr[Uri]]
  inline def revive(data: Uri): js.UndefOr[Uri] = ^.asInstanceOf[js.Dynamic].applyDynamic("revive")(data.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Uri]]
  inline def revive(data: UriComponents): js.UndefOr[Uri] = ^.asInstanceOf[js.Dynamic].applyDynamic("revive")(data.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Uri]]
  
  inline def revive_Uri(data: Uri): Uri = ^.asInstanceOf[js.Dynamic].applyDynamic("revive")(data.asInstanceOf[js.Any]).asInstanceOf[Uri]
  /**
    * A helper function to revive URIs.
    *
    * **Note** that this function should only be used when receiving Uri#toJSON generated data
    * and that it doesn't do any validation. Use {@link Uri.from} when received "untrusted"
    * uri components such as command arguments or data from storage.
    *
    * @param data The Uri components or Uri to revive.
    * @returns The revived Uri or undefined or null.
    */
  inline def revive_Uri(data: UriComponents): Uri = ^.asInstanceOf[js.Dynamic].applyDynamic("revive")(data.asInstanceOf[js.Any]).asInstanceOf[Uri]
}
