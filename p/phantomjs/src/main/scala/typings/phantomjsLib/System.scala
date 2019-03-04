package typings
package phantomjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait System extends js.Object {
  var args: js.Array[java.lang.String]
  var env: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var os: Anon_Architecture
  var pid: scala.Double
  var platform: java.lang.String
}

object System {
  @scala.inline
  def apply(
    args: js.Array[java.lang.String],
    env: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    os: Anon_Architecture,
    pid: scala.Double,
    platform: java.lang.String
  ): System = {
    val __obj = js.Dynamic.literal(args = args, env = env, os = os, pid = pid, platform = platform)
  
    __obj.asInstanceOf[System]
  }
}

