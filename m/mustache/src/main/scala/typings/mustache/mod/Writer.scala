package typings.mustache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Writer knows how to take a stream of tokens and render them to a `string`, given a context.
  *
  * It also maintains a cache of templates to avoid the need to parse the same template twice.
  */
@JSImport("mustache", "Writer")
@js.native
/**
  * Initializes a new instance of the `MustacheWriter` class.
  */
class Writer () extends MustacheWriter
