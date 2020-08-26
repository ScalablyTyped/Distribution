package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/path/
@js.native
trait Path extends js.Object {
  def basename(path: String): String = js.native
  def dirname(path: String): String = js.native
  def expanduser(path: String): String = js.native
  def extname(path: String): String = js.native
  def isAbsolute(path: String): Boolean = js.native
  def join(path: String, paths: String*): String = js.native
  def normalize(path: String): String = js.native
  def split(path: String): js.Array[String] = js.native
  def splitext(path: String): js.Tuple2[String, String] = js.native
}

object Path {
  @scala.inline
  def apply(
    basename: String => String,
    dirname: String => String,
    expanduser: String => String,
    extname: String => String,
    isAbsolute: String => Boolean,
    join: (String, /* repeated */ String) => String,
    normalize: String => String,
    split: String => js.Array[String],
    splitext: String => js.Tuple2[String, String]
  ): Path = {
    val __obj = js.Dynamic.literal(basename = js.Any.fromFunction1(basename), dirname = js.Any.fromFunction1(dirname), expanduser = js.Any.fromFunction1(expanduser), extname = js.Any.fromFunction1(extname), isAbsolute = js.Any.fromFunction1(isAbsolute), join = js.Any.fromFunction2(join), normalize = js.Any.fromFunction1(normalize), split = js.Any.fromFunction1(split), splitext = js.Any.fromFunction1(splitext))
    __obj.asInstanceOf[Path]
  }
  @scala.inline
  implicit class PathOps[Self <: Path] (val x: Self) extends AnyVal {
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
    def setBasename(value: String => String): Self = this.set("basename", js.Any.fromFunction1(value))
    @scala.inline
    def setDirname(value: String => String): Self = this.set("dirname", js.Any.fromFunction1(value))
    @scala.inline
    def setExpanduser(value: String => String): Self = this.set("expanduser", js.Any.fromFunction1(value))
    @scala.inline
    def setExtname(value: String => String): Self = this.set("extname", js.Any.fromFunction1(value))
    @scala.inline
    def setIsAbsolute(value: String => Boolean): Self = this.set("isAbsolute", js.Any.fromFunction1(value))
    @scala.inline
    def setJoin(value: (String, /* repeated */ String) => String): Self = this.set("join", js.Any.fromFunction2(value))
    @scala.inline
    def setNormalize(value: String => String): Self = this.set("normalize", js.Any.fromFunction1(value))
    @scala.inline
    def setSplit(value: String => js.Array[String]): Self = this.set("split", js.Any.fromFunction1(value))
    @scala.inline
    def setSplitext(value: String => js.Tuple2[String, String]): Self = this.set("splitext", js.Any.fromFunction1(value))
  }
  
}

