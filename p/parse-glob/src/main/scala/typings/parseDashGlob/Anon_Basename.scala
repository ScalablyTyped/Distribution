package typings.parseDashGlob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Basename extends js.Object {
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

object Anon_Basename {
  @scala.inline
  def apply(basename: String, dirname: String, ext: String, extname: String, filename: String): Anon_Basename = {
    val __obj = js.Dynamic.literal(basename = basename, dirname = dirname, ext = ext, extname = extname, filename = filename)
  
    __obj.asInstanceOf[Anon_Basename]
  }
}

