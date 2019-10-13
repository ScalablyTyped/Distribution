package typings.atNivoStream

import typings.atNivoCore.atNivoCoreMod.Dimensions
import typings.atNivoStream.atNivoStreamMod.StreamProps
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atNivoStreamComponents extends atNivoStreamProps {
  @scala.inline
  def ResponsiveStream[T]: ComponentType[ResponsiveStreamProps[T]] = js.constructorOf[typings.atNivoStream.atNivoStreamMod.ResponsiveStream[T]].asInstanceOf[typings.react.reactMod.ComponentType[ResponsiveStreamProps[T]]]
  @scala.inline
  def Stream[T]: ComponentType[StreamProps[T] with Dimensions] = js.constructorOf[typings.atNivoStream.atNivoStreamMod.Stream[T]].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.atNivoStream.atNivoStreamMod.StreamProps[T] with typings.atNivoCore.atNivoCoreMod.Dimensions]]
  @scala.inline
  def StreamDotsItem: ComponentType[StreamDotsItemProps] = js.constructorOf[typings.atNivoStream.atNivoStreamMod.StreamDotsItem].asInstanceOf[typings.react.reactMod.ComponentType[StreamDotsItemProps]]
}

