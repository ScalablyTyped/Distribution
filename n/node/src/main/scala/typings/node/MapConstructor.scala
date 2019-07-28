package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TypeScript 2.1-specific augmentations:
// Forward-declarations for needed types from es2015 and later (in case users are using `--lib es5`)
// Empty interfaces are used here which merge fine with the real declarations in the lib XXX files
// just to ensure the names are known and node typings can be sued without importing these libs.
// if someone really needs these types the libs need to be added via --lib or in tsconfig.json
trait MapConstructor extends js.Object

