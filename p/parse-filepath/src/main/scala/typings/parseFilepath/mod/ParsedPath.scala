package typings.parseFilepath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedPath extends js.Object {
  /**
    * fully resolved, absolute filepath
    */
  var absolute: String = js.native
  /**
    * The file name including extension (if any) such as `'index.html'`
    */
  var base: String = js.native
  /**
    * alias for `base`
    */
  var basename: String = js.native
  /**
    * The full directory path such as `'/home/user/dir'` or `'c:\path\dir'`
    */
  var dir: String = js.native
  /**
    * alias for `dir`
    */
  var dirname: String = js.native
  /**
    * The file extension (if any) such as `'.html'`
    */
  var ext: String = js.native
  /**
    * alias for `ext`
    */
  var extname: String = js.native
  /**
    * `true` if the given path is absolute
    */
  var isAbsolute: Boolean = js.native
  /**
    * The file name without extension (if any) such as `'index'`
    */
  var name: String = js.native
  /**
    * the original filepath
    */
  var path: String = js.native
  /**
    * The root of the path such as `'/'` or `'c:\'`
    */
  var root: String = js.native
  /**
    * alias for `name`
    */
  var stem: String = js.native
}

object ParsedPath {
  @scala.inline
  def apply(
    absolute: String,
    base: String,
    basename: String,
    dir: String,
    dirname: String,
    ext: String,
    extname: String,
    isAbsolute: Boolean,
    name: String,
    path: String,
    root: String,
    stem: String
  ): ParsedPath = {
    val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], basename = basename.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], dirname = dirname.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], extname = extname.asInstanceOf[js.Any], isAbsolute = isAbsolute.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], stem = stem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedPath]
  }
  @scala.inline
  implicit class ParsedPathOps[Self <: ParsedPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAbsolute(value: String): Self = this.set("absolute", value.asInstanceOf[js.Any])
    @scala.inline
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def setBasename(value: String): Self = this.set("basename", value.asInstanceOf[js.Any])
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirname(value: String): Self = this.set("dirname", value.asInstanceOf[js.Any])
    @scala.inline
    def setExt(value: String): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtname(value: String): Self = this.set("extname", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAbsolute(value: Boolean): Self = this.set("isAbsolute", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def setStem(value: String): Self = this.set("stem", value.asInstanceOf[js.Any])
  }
  
}

