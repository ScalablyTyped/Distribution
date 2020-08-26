package typings.parseGlob.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Basename extends js.Object {
  /**
    * File name with extension.
    */
  var basename: String = js.native
  /**
    * Directory.
    */
  var dirname: String = js.native
  /**
    * File extension without dot.
    */
  var ext: String = js.native
  /**
    * File extension with dot.
    */
  var extname: String = js.native
  /**
    * File name without extension.
    */
  var filename: String = js.native
}

object Basename {
  @scala.inline
  def apply(basename: String, dirname: String, ext: String, extname: String, filename: String): Basename = {
    val __obj = js.Dynamic.literal(basename = basename.asInstanceOf[js.Any], dirname = dirname.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], extname = extname.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[Basename]
  }
  @scala.inline
  implicit class BasenameOps[Self <: Basename] (val x: Self) extends AnyVal {
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
    def setBasename(value: String): Self = this.set("basename", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirname(value: String): Self = this.set("dirname", value.asInstanceOf[js.Any])
    @scala.inline
    def setExt(value: String): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtname(value: String): Self = this.set("extname", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
  }
  
}

