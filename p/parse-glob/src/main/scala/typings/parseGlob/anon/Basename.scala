package typings.parseGlob.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Basename extends js.Object {
  /**
    * File name with extension.
    */
  var basename: String
  /**
    * Directory.
    */
  var dirname: String
  /**
    * File extension without dot.
    */
  var ext: String
  /**
    * File extension with dot.
    */
  var extname: String
  /**
    * File name without extension.
    */
  var filename: String
}

object Basename {
  @scala.inline
  def apply(basename: String, dirname: String, ext: String, extname: String, filename: String): Basename = {
    val __obj = js.Dynamic.literal(basename = basename.asInstanceOf[js.Any], dirname = dirname.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], extname = extname.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[Basename]
  }
}

