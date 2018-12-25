package typings
package parseDashFilepathLib.parseDashFilepathMod.parseFilepathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ParsedPath extends js.Object {
  /**
           * fully resolved, absolute filepath
           */
  var absolute: java.lang.String
  /**
           * The file name including extension (if any) such as `'index.html'`
           */
  var base: java.lang.String
  /**
           * alias for `base`
           */
  var basename: java.lang.String
  /**
           * The full directory path such as `'/home/user/dir'` or `'c:\path\dir'`
           */
  var dir: java.lang.String
  /**
           * alias for `dir`
           */
  var dirname: java.lang.String
  /**
           * The file extension (if any) such as `'.html'`
           */
  var ext: java.lang.String
  /**
           * alias for `ext`
           */
  var extname: java.lang.String
  /**
           * `true` if the given path is absolute
           */
  var isAbsolute: scala.Boolean
  /**
           * The file name without extension (if any) such as `'index'`
           */
  var name: java.lang.String
  /**
           * the original filepath
           */
  var path: java.lang.String
  /**
           * The root of the path such as `'/'` or `'c:\'`
           */
  var root: java.lang.String
  /**
           * alias for `name`
           */
  var stem: java.lang.String
}

