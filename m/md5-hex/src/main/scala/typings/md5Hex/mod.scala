package typings.md5Hex

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(data: String): String = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(data: js.Array[Buffer | String]): String = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[String]
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
  @scala.inline
  def apply(data: Buffer): String = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("md5-hex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
