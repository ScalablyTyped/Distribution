package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/path/
trait Path extends js.Object {
  def basename(path: String): String
  def dirname(path: String): String
  def expanduser(path: String): String
  def extname(path: String): String
  def isAbsolute(path: String): Boolean
  def join(path: String, paths: String*): String
  def normalize(path: String): String
  def split(path: String): js.Array[String]
  def splitext(path: String): js.Tuple2[String, String]
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
}

