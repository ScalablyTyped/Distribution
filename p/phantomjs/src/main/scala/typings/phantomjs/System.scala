package typings.phantomjs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait System extends js.Object {
  var args: js.Array[String]
  var env: StringDictionary[String]
  var os: Anon_Architecture
  var pid: Double
  var platform: String
}

object System {
  @scala.inline
  def apply(
    args: js.Array[String],
    env: StringDictionary[String],
    os: Anon_Architecture,
    pid: Double,
    platform: String
  ): System = {
    val __obj = js.Dynamic.literal(args = args, env = env, os = os, pid = pid, platform = platform)
  
    __obj.asInstanceOf[System]
  }
}

