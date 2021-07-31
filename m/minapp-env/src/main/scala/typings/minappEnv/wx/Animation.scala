package typings.minappEnv.wx

import typings.minappEnv.Array
import typings.minappEnv.Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animation extends StObject {
  
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.backgroundColor(string value)](Animation.backgroundColor.md)
    *
    * 设置背景色 */
  def backgroundColor(/** 颜色值 */
  value: String): Animation = js.native
  
  def bottom(/** 长度值，如果传入 number 则默认使用 px，可传入其他自定义单位的长度值 */
  value: String): Animation = js.native
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.bottom(number|string value)](Animation.bottom.md)
    *
    * 设置 bottom 值 */
  def bottom(/** 长度值，如果传入 number 则默认使用 px，可传入其他自定义单位的长度值 */
  value: Double): Animation = js.native
  
  /** [Array.<Object> Animation.export()](Animation.export.md)
    *
    * 导出动画队列。**export 方法每次调用后会清掉之前的动画操作。** */
  def `export`(): Array[Object] = js.native
  
  def height(/** 长度值，如果传入 number 则默认使用 px，可传入其他自定义单位的长度值 */
  value: String): Animation = js.native
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.height(number|string value)](Animation.height.md)
    *
    * 设置高度 */
  def height(/** 长度值，如果传入 number 则默认使用 px，可传入其他自定义单位的长度值 */
  value: Double): Animation = js.native
  
  def left(/** 长度值，如果传入 number 则默认使用 px，可传入其他自定义单位的长度值 */
  value: String): Animation = js.native
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.left(number|string value)](Animation.left.md)
    *
    * 设置 left 值 */
  def left(/** 长度值，如果传入 number 则默认使用 px，可传入其他自定义单位的长度值 */
  value: Double): Animation = js.native
  
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.matrix()](Animation.matrix.md)
    *
    * 同 [transform-function matrix](https://developer.mozilla.org/en-US/docs/Web/CSS/transform-function/matrix) */
  def matrix(): Animation = js.native
  
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.matrix3d()](Animation.matrix3d.md)
    *
    * 同 [transform-function matrix3d](https://developer.mozilla.org/en-US/docs/Web/CSS/transform-function/matrix3d) */
  def matrix3d(): Animation = js.native
  
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.opacity(number value)](Animation.opacity.md)
    *
    * 设置透明度 */
  def opacity(/** 透明度，范围 0-1 */
  value: Double): Animation = js.native
  
  def right(/** 长度值，如果传入 number 则默认使用 px，可传入其他自定义单位的长度值 */
  value: String): Animation = js.native
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.right(number|string value)](Animation.right.md)
    *
    * 设置 right 值 */
  def right(/** 长度值，如果传入 number 则默认使用 px，可传入其他自定义单位的长度值 */
  value: Double): Animation = js.native
  
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.rotate(number angle)](Animation.rotate.md)
    *
    * 从原点顺时针旋转一个角度 */
  def rotate(/** 旋转的角度。范围 [-180, 180] */
  angle: Double): Animation = js.native
  
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.rotate3d(number x, number y, number z, number angle)](Animation.rotate3d.md)
    *
    * 从 X 轴顺时针旋转一个角度 */
  def rotate3d(
    /** 旋转轴的 x 坐标 */
  x: Double,
    /** 旋转轴的 y 坐标 */
  y: Double,
    /** 旋转轴的 z 坐标 */
  z: Double,
    /** 旋转的角度。范围 [-180, 180] */
  angle: Double
  ): Animation = js.native
  
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.rotateX(number angle)](Animation.rotateX.md)
    *
    * 从 X 轴顺时针旋转一个角度 */
  def rotateX(/** 旋转的角度。范围 [-180, 180] */
  angle: Double): Animation = js.native
  
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.rotateY(number angle)](Animation.rotateY.md)
    *
    * 从 Y 轴顺时针旋转一个角度 */
  def rotateY(/** 旋转的角度。范围 [-180, 180] */
  angle: Double): Animation = js.native
  
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.rotateZ(number angle)](Animation.rotateZ.md)
    *
    * 从 Z 轴顺时针旋转一个角度 */
  def rotateZ(/** 旋转的角度。范围 [-180, 180] */
  angle: Double): Animation = js.native
  
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.scale(number sx, number sy)](Animation.scale.md)
    *
    * 缩放 */
  def scale(/** 当仅有 sx 参数时，表示在 X 轴、Y 轴同时缩放sx倍数 */
  sx: Double): Animation = js.native
  def scale(/** 当仅有 sx 参数时，表示在 X 轴、Y 轴同时缩放sx倍数 */
  sx: Double, /** 在 Y 轴缩放 sy 倍数 */
  sy: Double): Animation = js.native
  
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.scale3d(number sx, number sy, number sz)](Animation.scale3d.md)
    *
    * 缩放 */
  def scale3d(/** x 轴的缩放倍数 */
  sx: Double, /** y 轴的缩放倍数 */
  sy: Double, /** z 轴的缩放倍数 */
  sz: Double): Animation = js.native
  
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.scaleX(number scale)](Animation.scaleX.md)
    *
    * 缩放 X 轴 */
  def scaleX(/** X 轴的缩放倍数 */
  scale: Double): Animation = js.native
  
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.scaleY(number scale)](Animation.scaleY.md)
    *
    * 缩放 Y 轴 */
  def scaleY(/** Y 轴的缩放倍数 */
  scale: Double): Animation = js.native
  
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.scaleZ(number scale)](Animation.scaleZ.md)
    *
    * 缩放 Z 轴 */
  def scaleZ(/** Z 轴的缩放倍数 */
  scale: Double): Animation = js.native
  
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.skew(number ax, number ay)](Animation.skew.md)
    *
    * 对 X、Y 轴坐标进行倾斜 */
  def skew(/** 对 X 轴坐标倾斜的角度，范围 [-180, 180] */
  ax: Double, /** 对 Y 轴坐标倾斜的角度，范围 [-180, 180] */
  ay: Double): Animation = js.native
  
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.skewX(number angle)](Animation.skewX.md)
    *
    * 对 X 轴坐标进行倾斜 */
  def skewX(/** 倾斜的角度，范围 [-180, 180] */
  angle: Double): Animation = js.native
  
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.skewY(number angle)](Animation.skewY.md)
    *
    * 对 Y 轴坐标进行倾斜 */
  def skewY(/** 倾斜的角度，范围 [-180, 180] */
  angle: Double): Animation = js.native
  
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.step(Object object)](Animation.step.md)
    *
    * 表示一组动画完成。可以在一组动画中调用任意多个动画方法，一组动画中的所有动画会同时开始，一组动画完成后才会进行下一组动画。 */
  def step(): Animation = js.native
  def step(option: StepOption): Animation = js.native
  
  def top(/** 长度值，如果传入 number 则默认使用 px，可传入其他自定义单位的长度值 */
  value: String): Animation = js.native
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.top(number|string value)](Animation.top.md)
    *
    * 设置 top 值 */
  def top(/** 长度值，如果传入 number 则默认使用 px，可传入其他自定义单位的长度值 */
  value: Double): Animation = js.native
  
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.translate(number tx, number ty)](Animation.translate.md)
    *
    * 平移变换 */
  def translate(): Animation = js.native
  def translate(/** 当仅有该参数时表示在 X 轴偏移 tx，单位 px */
  tx: Double): Animation = js.native
  def translate(/** 当仅有该参数时表示在 X 轴偏移 tx，单位 px */
  tx: Double, /** 在 Y 轴平移的距离，单位为 px */
  ty: Double): Animation = js.native
  def translate(/** 当仅有该参数时表示在 X 轴偏移 tx，单位 px */
  tx: Unit, /** 在 Y 轴平移的距离，单位为 px */
  ty: Double): Animation = js.native
  
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.translate3d(number tx, number ty, number tz)](Animation.translate3d.md)
    *
    * 对 xyz 坐标进行平移变换 */
  def translate3d(): Animation = js.native
  def translate3d(/** 在 X 轴平移的距离，单位为 px */
  tx: Double): Animation = js.native
  def translate3d(/** 在 X 轴平移的距离，单位为 px */
  tx: Double, /** 在 Y 轴平移的距离，单位为 px */
  ty: Double): Animation = js.native
  def translate3d(
    /** 在 X 轴平移的距离，单位为 px */
  tx: Double,
    /** 在 Y 轴平移的距离，单位为 px */
  ty: Double,
    /** 在 Z 轴平移的距离，单位为 px */
  tz: Double
  ): Animation = js.native
  def translate3d(
    /** 在 X 轴平移的距离，单位为 px */
  tx: Double,
    /** 在 Y 轴平移的距离，单位为 px */
  ty: Unit,
    /** 在 Z 轴平移的距离，单位为 px */
  tz: Double
  ): Animation = js.native
  def translate3d(/** 在 X 轴平移的距离，单位为 px */
  tx: Unit, /** 在 Y 轴平移的距离，单位为 px */
  ty: Double): Animation = js.native
  def translate3d(
    /** 在 X 轴平移的距离，单位为 px */
  tx: Unit,
    /** 在 Y 轴平移的距离，单位为 px */
  ty: Double,
    /** 在 Z 轴平移的距离，单位为 px */
  tz: Double
  ): Animation = js.native
  def translate3d(
    /** 在 X 轴平移的距离，单位为 px */
  tx: Unit,
    /** 在 Y 轴平移的距离，单位为 px */
  ty: Unit,
    /** 在 Z 轴平移的距离，单位为 px */
  tz: Double
  ): Animation = js.native
  
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.translateX(number translation)](Animation.translateX.md)
    *
    * 对 X 轴平移 */
  def translateX(/** 在 X 轴平移的距离，单位为 px */
  translation: Double): Animation = js.native
  
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.translateY(number translation)](Animation.translateY.md)
    *
    * 对 Y 轴平移 */
  def translateY(/** 在 Y 轴平移的距离，单位为 px */
  translation: Double): Animation = js.native
  
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.translateZ(number translation)](Animation.translateZ.md)
    *
    * 对 Z 轴平移 */
  def translateZ(/** 在 Z 轴平移的距离，单位为 px */
  translation: Double): Animation = js.native
  
  def width(/** 长度值，如果传入 number 则默认使用 px，可传入其他自定义单位的长度值 */
  value: String): Animation = js.native
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) Animation.width(number|string value)](Animation.width.md)
    *
    * 设置宽度 */
  def width(/** 长度值，如果传入 number 则默认使用 px，可传入其他自定义单位的长度值 */
  value: Double): Animation = js.native
}
