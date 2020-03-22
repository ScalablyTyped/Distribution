package typings.nivoStream

import typings.nivoCore.mod.Dimensions
import typings.nivoStream.mod.StreamProps
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nivoStreamComponents extends nivoStreamProps {
  @scala.inline
  def ResponsiveStream[T]: ComponentType[ResponsiveStreamProps[T]] = js.constructorOf[typings.nivoStream.mod.ResponsiveStream[T]].asInstanceOf[typings.react.mod.ComponentType[ResponsiveStreamProps[T]]]
  @scala.inline
  def Stream[T]: ComponentType[StreamProps[T] with Dimensions] = js.constructorOf[typings.nivoStream.mod.Stream[T]].asInstanceOf[typings.react.mod.ComponentType[typings.nivoStream.mod.StreamProps[T] with typings.nivoCore.mod.Dimensions]]
  @scala.inline
  def StreamDotsItem: ComponentType[StreamDotsItemProps] = js.constructorOf[typings.nivoStream.mod.StreamDotsItem].asInstanceOf[typings.react.mod.ComponentType[StreamDotsItemProps]]
}

