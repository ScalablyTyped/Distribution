package typings.node.v8Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A subclass of `Serializer` that serializes `TypedArray` (in particular `Buffer`) and `DataView` objects as host objects,
  * and only stores the part of their underlying `ArrayBuffers` that they are referring to.
  */
@JSImport("v8", "DefaultDeserializer")
@js.native
class DefaultDeserializer () extends Deserializer

