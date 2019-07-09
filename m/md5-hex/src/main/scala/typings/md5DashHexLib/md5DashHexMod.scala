package typings
package md5DashHexLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("md5-hex", JSImport.Namespace)
@js.native
object md5DashHexMod extends js.Object {
  /**
  Create a MD5 hash with hex encoding.
  @param data - Prefer buffers as they're faster to hash, but strings can be useful for small things.
  Pass an array instead of concatenating strings and/or buffers. The output is the same, but arrays do not incur the overhead of concatenation.
  @example
  ```
  import * as fs from 'fs';
  import md5Hex = require('md5-hex');
  const buffer = fs.readFileSync('unicorn.png');
  md5Hex(buffer);
  //=> '1abcb33beeb811dca15f0ac3e47b88d9'
  ```
  */
  def apply(data: nodeLib.Buffer | java.lang.String | (js.Array[nodeLib.Buffer | java.lang.String])): java.lang.String = js.native
}

