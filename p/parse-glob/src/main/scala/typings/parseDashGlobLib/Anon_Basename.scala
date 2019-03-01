package typings
package parseDashGlobLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Basename extends js.Object {
  /**
    * File name with extension.
    */
  var basename: java.lang.String
  /**
    * Directory.
    */
  var dirname: java.lang.String
  /**
    * File extension without dot.
    */
  var ext: java.lang.String
  /**
    * File extension with dot.
    */
  var extname: java.lang.String
  /**
    * File name without extension.
    */
  var filename: java.lang.String
}

object Anon_Basename {
  @scala.inline
  def apply(
    basename: java.lang.String,
    dirname: java.lang.String,
    ext: java.lang.String,
    extname: java.lang.String,
    filename: java.lang.String
  ): Anon_Basename = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("basename")(basename)
    __obj.updateDynamic("dirname")(dirname)
    __obj.updateDynamic("ext")(ext)
    __obj.updateDynamic("extname")(extname)
    __obj.updateDynamic("filename")(filename)
    __obj.asInstanceOf[Anon_Basename]
  }
}

