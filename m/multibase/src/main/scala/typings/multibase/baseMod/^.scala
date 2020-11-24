package typings.multibase.baseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./types').CodecFactory} CodecFactory */
/** @typedef {import("./types").BaseName} BaseName */
/** @typedef {import("./types").BaseCode} BaseCode */
/**
  * Class to encode/decode in the supported Bases
  *
  */
@JSImport("multibase/dist/src/base", JSImport.Namespace)
@js.native
class ^ protected () extends Base {
  /**
    * @param {BaseName} name
    * @param {BaseCode} code
    * @param {CodecFactory} factory
    * @param {string} alphabet
    */
  def this(name: BaseName, code: BaseCode, factory: CodecFactory, alphabet: String) = this()
}
