package typings.minappEnv.wx

import typings.minappEnv.Array
import typings.minappEnv.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** canvas 组件的绘图上下文 */
@js.native
trait CanvasContext extends js.Object {
  /** 填充颜色。用法同 [CanvasContext.setFillStyle()](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.setFillStyle.html)。
    *
    * 最低基础库： `1.9.90` */
  var fillStyle: String = js.native
  /** 当前字体样式的属性。符合 [CSS font 语法](https://developer.mozilla.org/zh-CN/docs/Web/CSS/font) 的 DOMString 字符串，至少需要提供字体大小和字体族名。默认值为 10px sans-serif。
    *
    * 最低基础库： `1.9.90` */
  var font: String = js.native
  /** 全局画笔透明度。范围 0-1，0 表示完全透明，1 表示完全不透明。 */
  var globalAlpha: Double = js.native
  /** 在绘制新形状时应用的合成操作的类型。目前安卓版本只适用于 `fill` 填充块的合成，用于 `stroke` 线段的合成效果都是 `source-over`。
    *
    * 目前支持的操作有
    * - 安卓：xor, source-over, source-atop, destination-out, lighter, overlay, darken, lighten, hard-light
    * - iOS：xor, source-over, source-atop, destination-over, destination-out, lighter, multiply, overlay, darken, lighten, color-dodge, color-burn, hard-light, soft-light, difference, exclusion, saturation, luminosity
    *
    * 最低基础库： `1.9.90` */
  var globalCompositeOperation: String = js.native
  /** 线条的端点样式。用法同 [CanvasContext.setLineCap()](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.setLineCap.html)。
    *
    * 最低基础库： `1.9.90` */
  var lineCap: Double = js.native
  /** 虚线偏移量，初始值为0
    *
    * 最低基础库： `1.9.90` */
  var lineDashOffset: Double = js.native
  /** 线条的交点样式。用法同 [CanvasContext.setLineJoin()](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.setLineJoin.html)。
    *
    * 最低基础库： `1.9.90` */
  var lineJoin: Double = js.native
  /** 线条的宽度。用法同 [CanvasContext.setLineWidth()](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.setLineWidth.html)。
    *
    * 最低基础库： `1.9.90` */
  var lineWidth: Double = js.native
  /** 最大斜接长度。用法同 [CanvasContext.setMiterLimit()](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.setMiterLimit.html)。
    *
    * 最低基础库： `1.9.90` */
  var miterLimit: Double = js.native
  /** 阴影的模糊级别
    *
    * 最低基础库： `1.9.90` */
  var shadowBlur: Double = js.native
  /** 阴影的颜色
    *
    * 最低基础库： `1.9.90` */
  var shadowColor: Double = js.native
  /** 阴影相对于形状在水平方向的偏移
    *
    * 最低基础库： `1.9.90` */
  var shadowOffsetX: Double = js.native
  /** 阴影相对于形状在竖直方向的偏移
    *
    * 最低基础库： `1.9.90` */
  var shadowOffsetY: Double = js.native
  /** 边框颜色。用法同 [CanvasContext.setFillStyle()](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.setStrokeStyle.html)。
    *
    * 最低基础库： `1.9.90` */
  var strokeStyle: String = js.native
  /** [CanvasContext.arc(number x, number y, number r, number sAngle, number eAngle, number counterclockwise)](CanvasContext.arc.md)
  *
  * 创建一条弧线。
  *
  *   - 创建一个圆可以指定起始弧度为 0，终止弧度为 2 * Math.PI。
  *   - 用 `stroke` 或者 `fill` 方法来在 `canvas` 中画弧线。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
    
  // Draw coordinates
  ctx.arc(100, 75, 50, 0, 2 * Math.PI)
  ctx.setFillStyle('#EEEEEE')
  ctx.fill()
    
  ctx.beginPath()
  ctx.moveTo(40, 75)
  ctx.lineTo(160, 75)
  ctx.moveTo(100, 15)
  ctx.lineTo(100, 135)
  ctx.setStrokeStyle('#AAAAAA')
  ctx.stroke()
    
  ctx.setFontSize(12)
  ctx.setFillStyle('black')
  ctx.fillText('0', 165, 78)
  ctx.fillText('0.5*PI', 83, 145)
  ctx.fillText('1*PI', 15, 78)
  ctx.fillText('1.5*PI', 83, 10)
    
  // Draw points
  ctx.beginPath()
  ctx.arc(100, 75, 2, 0, 2 * Math.PI)
  ctx.setFillStyle('lightgreen')
  ctx.fill()
    
  ctx.beginPath()
  ctx.arc(100, 25, 2, 0, 2 * Math.PI)
  ctx.setFillStyle('blue')
  ctx.fill()
    
  ctx.beginPath()
  ctx.arc(150, 75, 2, 0, 2 * Math.PI)
  ctx.setFillStyle('red')
  ctx.fill()
    
  // Draw arc
  ctx.beginPath()
  ctx.arc(100, 75, 50, 0, 1.5 * Math.PI)
  ctx.setStrokeStyle('#333333')
  ctx.stroke()
    
  ctx.draw()
  ```
  *
  * ![]((canvas/arc.png))
  *
  * 针对 arc(100, 75, 50, 0, 1.5 * Math.PI)的三个关键坐标如下：
  *
  * - 绿色: 圆心 (100, 75)
  * - 红色: 起始弧度 (0)
  * - 蓝色: 终止弧度 (1.5 * Math.PI) */
  def arc(
    /** 圆心的 x 坐标 */
  x: Double,
    /** 圆心的 y 坐标 */
  y: Double,
    /** 圆的半径 */
  r: Double,
    /** 起始弧度，单位弧度（在3点钟方向） */
  sAngle: Double,
    /** 终止弧度 */
  eAngle: Double
  ): Unit = js.native
  def arc(
    /** 圆心的 x 坐标 */
  x: Double,
    /** 圆心的 y 坐标 */
  y: Double,
    /** 圆的半径 */
  r: Double,
    /** 起始弧度，单位弧度（在3点钟方向） */
  sAngle: Double,
    /** 终止弧度 */
  eAngle: Double,
    /** 弧度的方向是否是逆时针 */
  counterclockwise: Double
  ): Unit = js.native
  /** [CanvasContext.arcTo(number x1, number y1, number x2, number y2, number radius)](CanvasContext.arcTo.md)
    *
    * 根据控制点和半径绘制圆弧路径。
    *
    * 最低基础库： `1.9.90` */
  def arcTo(
    /** 第一个控制点的 x 轴坐标 */
  x1: Double,
    /** 第一个控制点的 y 轴坐标 */
  y1: Double,
    /** 第二个控制点的 x 轴坐标 */
  x2: Double,
    /** 第二个控制点的 y 轴坐标 */
  y2: Double,
    /** 圆弧的半径 */
  radius: Double
  ): Unit = js.native
  /** [CanvasContext.beginPath()](CanvasContext.beginPath.md)
  *
  * 开始创建一个路径。需要调用 `fill` 或者 `stroke` 才会使用路径进行填充或描边
  *
  *   - 在最开始的时候相当于调用了一次 `beginPath`。
  *   - 同一个路径内的多次 `setFillStyle`、`setStrokeStyle`、`setLineWidth`等设置，以最后一次设置为准。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  // begin path
  ctx.rect(10, 10, 100, 30)
  ctx.setFillStyle('yellow')
  ctx.fill()
    
  // begin another path
  ctx.beginPath()
  ctx.rect(10, 40, 100, 30)
    
  // only fill this rect, not in current path
  ctx.setFillStyle('blue')
  ctx.fillRect(10, 70, 100, 30)
    
  ctx.rect(10, 100, 100, 30)
    
  // it will fill current path
  ctx.setFillStyle('red')
  ctx.fill()
  ctx.draw()
  ```
  *
  * ![]((canvas/fill-path.png)) */
  def beginPath(): Unit = js.native
  /** [CanvasContext.bezierCurveTo()](CanvasContext.bezierCurveTo.md)
  *
  * 创建三次方贝塞尔曲线路径。曲线的起始点为路径中前一个点。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
    
  // Draw points
  ctx.beginPath()
  ctx.arc(20, 20, 2, 0, 2 * Math.PI)
  ctx.setFillStyle('red')
  ctx.fill()
    
  ctx.beginPath()
  ctx.arc(200, 20, 2, 0, 2 * Math.PI)
  ctx.setFillStyle('lightgreen')
  ctx.fill()
    
  ctx.beginPath()
  ctx.arc(20, 100, 2, 0, 2 * Math.PI)
  ctx.arc(200, 100, 2, 0, 2 * Math.PI)
  ctx.setFillStyle('blue')
  ctx.fill()
    
  ctx.setFillStyle('black')
  ctx.setFontSize(12)
    
  // Draw guides
  ctx.beginPath()
  ctx.moveTo(20, 20)
  ctx.lineTo(20, 100)
  ctx.lineTo(150, 75)
    
  ctx.moveTo(200, 20)
  ctx.lineTo(200, 100)
  ctx.lineTo(70, 75)
  ctx.setStrokeStyle('#AAAAAA')
  ctx.stroke()
    
  // Draw quadratic curve
  ctx.beginPath()
  ctx.moveTo(20, 20)
  ctx.bezierCurveTo(20, 100, 200, 100, 200, 20)
  ctx.setStrokeStyle('black')
  ctx.stroke()
    
  ctx.draw()
  ```
  *
  * ![]((canvas/bezier-curve.png))
  *
  * 针对 moveTo(20, 20) bezierCurveTo(20, 100, 200, 100, 200, 20) 的三个关键坐标如下：
  *
  * - 红色：起始点(20, 20)
  * - 蓝色：两个控制点(20, 100) (200, 100)
  * - 绿色：终止点(200, 20) */
  def bezierCurveTo(): Unit = js.native
  /** [CanvasContext.clearRect(number x, number y, number width, number height)](CanvasContext.clearRect.md)
  *
  * 清除画布上在该矩形区域内的内容
  *
  * **示例代码**
  *
  *
  * clearRect 并非画一个白色的矩形在地址区域，而是清空，为了有直观感受，对 canvas 加了一层背景色。
  * ```html
  * <canvas canvas-id="myCanvas" style="border: 1px solid; background: #123456;"/>
  * ```
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.setFillStyle('red')
  ctx.fillRect(0, 0, 150, 200)
  ctx.setFillStyle('blue')
  ctx.fillRect(150, 0, 150, 200)
  ctx.clearRect(10, 10, 150, 75)
  ctx.draw()
  ```
  * ![]((canvas/clear-rect.png)) */
  def clearRect(
    /** 矩形路径左上角的横坐标 */
  x: Double,
    /** 矩形路径左上角的横坐标 */
  y: Double,
    /** 矩形路径的宽度 */
  width: Double,
    /** 矩形路径的高度 */
  height: Double
  ): Unit = js.native
  /** [CanvasContext.clip()](CanvasContext.clip.md)
  *
  * 从原始画布中剪切任意形状和尺寸。一旦剪切了某个区域，则所有之后的绘图都会被限制在被剪切的区域内（不能访问画布上的其他区域）。可以在使用 `clip` 方法前通过使用 `save` 方法对当前画布区域进行保存，并在以后的任意时间通过`restore`方法对其进行恢复。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
    
  wx.downloadFile({
    url: 'http://is5.mzstatic.com/image/thumb/Purple128/v4/75/3b/90/753b907c-b7fb-5877-215a-759bd73691a4/source/50x50bb.jpg',
    success: function(res) {
    ctx.save()
    ctx.beginPath()
    ctx.arc(50, 50, 25, 0, 2*Math.PI)
    ctx.clip()
    ctx.drawImage(res.tempFilePath, 25, 25)
    ctx.restore()
    ctx.draw()
    }
  })
  ```
  * ![]((canvas/clip.png))
  *
  * 最低基础库： `1.6.0` */
  def clip(): Unit = js.native
  /** [CanvasContext.closePath()](CanvasContext.closePath.md)
  *
  * 关闭一个路径。会连接起点和终点。如果关闭路径后没有调用 `fill` 或者 `stroke` 并开启了新的路径，那之前的路径将不会被渲染。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.moveTo(10, 10)
  ctx.lineTo(100, 10)
  ctx.lineTo(100, 100)
  ctx.closePath()
  ctx.stroke()
  ctx.draw()
  ```
  * ![]((canvas/close-line.png))
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  // begin path
  ctx.rect(10, 10, 100, 30)
  ctx.closePath()
    
  // begin another path
  ctx.beginPath()
  ctx.rect(10, 40, 100, 30)
    
  // only fill this rect, not in current path
  ctx.setFillStyle('blue')
  ctx.fillRect(10, 70, 100, 30)
    
  ctx.rect(10, 100, 100, 30)
    
  // it will fill current path
  ctx.setFillStyle('red')
  ctx.fill()
  ctx.draw()
  ```
  *
  * ![]((canvas/close-path.png)) */
  def closePath(): Unit = js.native
  /** [[CanvasGradient](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasGradient.html) CanvasContext.createCircularGradient(number x, number y, number r)](CanvasContext.createCircularGradient.md)
  *
  * 创建一个圆形的渐变颜色。起点在圆心，终点在圆环。返回的`CanvasGradient`对象需要使用 [CanvasGradient.addColorStop()](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasGradient.addColorStop.html) 来指定渐变点，至少要两个。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
    
  // Create circular gradient
  const grd = ctx.createCircularGradient(75, 50, 50)
  grd.addColorStop(0, 'red')
  grd.addColorStop(1, 'white')
    
  // Fill with gradient
  ctx.setFillStyle(grd)
  ctx.fillRect(10, 10, 150, 80)
  ctx.draw()
  ```
  * ![]((canvas/circular-gradient.png)) */
  def createCircularGradient(/** 圆心的 x 坐标 */
  x: Double, /** 圆心的 y 坐标 */
  y: Double, /** 圆的半径 */
  r: Double): CanvasGradient = js.native
  /** [[CanvasGradient](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasGradient.html) CanvasContext.createLinearGradient(number x0, number y0, number x1, number y1)](CanvasContext.createLinearGradient.md)
  *
  * 创建一个线性的渐变颜色。返回的`CanvasGradient`对象需要使用 [CanvasGradient.addColorStop()](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasGradient.addColorStop.html) 来指定渐变点，至少要两个。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
    
  // Create linear gradient
  const grd = ctx.createLinearGradient(0, 0, 200, 0)
  grd.addColorStop(0, 'red')
  grd.addColorStop(1, 'white')
    
  // Fill with gradient
  ctx.setFillStyle(grd)
  ctx.fillRect(10, 10, 150, 80)
  ctx.draw()
  ```
  * ![]((canvas/linear-gradient.png)) */
  def createLinearGradient(
    /** 起点的 x 坐标 */
  x0: Double,
    /** 起点的 y 坐标 */
  y0: Double,
    /** 终点的 x 坐标 */
  x1: Double,
    /** 终点的 y 坐标 */
  y1: Double
  ): CanvasGradient = js.native
  /** [CanvasContext.createPattern(string image, string repetition)](CanvasContext.createPattern.md)
    *
    * 对指定的图像创建模式的方法，可在指定的方向上重复元图像
    *
    * 最低基础库： `1.9.90` */
  def createPattern(/** 重复的图像源，仅支持包内路径和临时路径 */
  image: String, /** 如何重复图像 */
  repetition: String): Unit = js.native
  /** [CanvasContext.draw(boolean reserve, function callback)](CanvasContext.draw.md)
  *
  * 将之前在绘图上下文中的描述（路径、变形、样式）画到 canvas 中。
  *
  * **示例代码**
  *
  *
  * 第二次 draw() reserve 为 true。所以保留了上一次的绘制结果，在上下文设置的 fillStyle 'red' 也变成了默认的 'black'。
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
    
  ctx.setFillStyle('red')
  ctx.fillRect(10, 10, 150, 100)
  ctx.draw()
  ctx.fillRect(50, 50, 150, 100)
  ctx.draw(true)
  ```
  * ![]((canvas/reserve.png))
  *
  * **示例代码**
  *
  *
  * 第二次 draw() reserve 为 false。所以没有保留了上一次的绘制结果和在上下文设置的 fillStyle 'red'。
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
    
  ctx.setFillStyle('red')
  ctx.fillRect(10, 10, 150, 100)
  ctx.draw()
  ctx.fillRect(50, 50, 150, 100)
  ctx.draw()
  ```
  * ![]((canvas/un-reserve.png)) */
  def draw(/** 绘制完成后执行的回调函数 */
  callback: Function): Unit = js.native
  /** [CanvasContext.draw(boolean reserve, function callback)](CanvasContext.draw.md)
  *
  * 将之前在绘图上下文中的描述（路径、变形、样式）画到 canvas 中。
  *
  * **示例代码**
  *
  *
  * 第二次 draw() reserve 为 true。所以保留了上一次的绘制结果，在上下文设置的 fillStyle 'red' 也变成了默认的 'black'。
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
    
  ctx.setFillStyle('red')
  ctx.fillRect(10, 10, 150, 100)
  ctx.draw()
  ctx.fillRect(50, 50, 150, 100)
  ctx.draw(true)
  ```
  * ![]((canvas/reserve.png))
  *
  * **示例代码**
  *
  *
  * 第二次 draw() reserve 为 false。所以没有保留了上一次的绘制结果和在上下文设置的 fillStyle 'red'。
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
    
  ctx.setFillStyle('red')
  ctx.fillRect(10, 10, 150, 100)
  ctx.draw()
  ctx.fillRect(50, 50, 150, 100)
  ctx.draw()
  ```
  * ![]((canvas/un-reserve.png)) */
  def draw(
    /** 本次绘制是否接着上一次绘制。即 reserve 参数为 false，则在本次调用绘制之前 native 层会先清空画布再继续绘制；若 reserve 参数为 true，则保留当前画布上的内容，本次调用 drawCanvas 绘制的内容覆盖在上面，默认 false。 */
  reserve: Boolean,
    /** 绘制完成后执行的回调函数 */
  callback: Function
  ): Unit = js.native
  /** [CanvasContext.drawImage(string imageResource, number dx, number dy, number dWidth, number dHeight, number sx, number sy, number sWidth, number sHeight)](CanvasContext.drawImage.md)
  *
  * 绘制图像到画布
  *
  * **示例代码**
  *
  *
  *
  * 有三个版本的写法：
  *
  * - drawImage(dx, dy)
  * - drawImage(dx, dy, dWidth, dHeight)
  * - drawImage(sx, sy, sWidth, sHeight, dx, dy, dWidth, dHeight) 从 1.9.0 起支持
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
    
  wx.chooseImage({
    success: function(res){
    ctx.drawImage(res.tempFilePaths[0], 0, 0, 150, 100)
    ctx.draw()
    }
  })
    
  ```
  * ![]((canvas/draw-image.png)) */
  def drawImage(
    /** 所要绘制的图片资源 */
  imageResource: String,
    /** 图像的左上角在目标 canvas 上 x 轴的位置 */
  dx: Double,
    /** 图像的左上角在目标 canvas 上 y 轴的位置 */
  dy: Double,
    /** 在目标画布上绘制图像的宽度，允许对绘制的图像进行缩放 */
  dWidth: Double,
    /** 在目标画布上绘制图像的高度，允许对绘制的图像进行缩放 */
  dHeight: Double,
    /** 源图像的矩形选择框的左上角 x 坐标 */
  sx: Double,
    /** 源图像的矩形选择框的左上角 y 坐标 */
  sy: Double,
    /** 源图像的矩形选择框的宽度 */
  sWidth: Double,
    /** 源图像的矩形选择框的高度 */
  sHeight: Double
  ): Unit = js.native
  /** [CanvasContext.fill()](CanvasContext.fill.md)
  *
  * 对当前路径中的内容进行填充。默认的填充色为黑色。
  *
  * **示例代码**
  *
  *
  *
  * 如果当前路径没有闭合，fill() 方法会将起点和终点进行连接，然后填充。
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.moveTo(10, 10)
  ctx.lineTo(100, 10)
  ctx.lineTo(100, 100)
  ctx.fill()
  ctx.draw()
  ```
  *
  * fill() 填充的的路径是从 beginPath() 开始计算，但是不会将 fillRect() 包含进去。
  *
  * ![]((canvas/fill-line.png))
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  // begin path
  ctx.rect(10, 10, 100, 30)
  ctx.setFillStyle('yellow')
  ctx.fill()
    
  // begin another path
  ctx.beginPath()
  ctx.rect(10, 40, 100, 30)
    
  // only fill this rect, not in current path
  ctx.setFillStyle('blue')
  ctx.fillRect(10, 70, 100, 30)
    
  ctx.rect(10, 100, 100, 30)
    
  // it will fill current path
  ctx.setFillStyle('red')
  ctx.fill()
  ctx.draw()
  ```
  *
  * ![]((canvas/fill-path.png)) */
  def fill(): Unit = js.native
  /** [CanvasContext.fillRect(number x, number y, number width, number height)](CanvasContext.fillRect.md)
  *
  * 填充一个矩形。用 [`setFillStyle`](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.setFillStyle.html) 设置矩形的填充色，如果没设置默认是黑色。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.setFillStyle('red')
  ctx.fillRect(10, 10, 150, 75)
  ctx.draw()
  ```
  * ![]((canvas/fill-rect.png)) */
  def fillRect(
    /** 矩形路径左上角的横坐标 */
  x: Double,
    /** 矩形路径左上角的横坐标 */
  y: Double,
    /** 矩形路径的宽度 */
  width: Double,
    /** 矩形路径的高度 */
  height: Double
  ): Unit = js.native
  /** [CanvasContext.fillText(string text, number x, number y, number maxWidth)](CanvasContext.fillText.md)
  *
  * 在画布上绘制被填充的文本
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
    
  ctx.setFontSize(20)
  ctx.fillText('Hello', 20, 20)
  ctx.fillText('MINA', 100, 100)
    
  ctx.draw()
  ```
  * ![]((canvas/text.png)) */
  def fillText(/** 在画布上输出的文本 */
  text: String, /** 绘制文本的左上角 x 坐标位置 */
  x: Double, /** 绘制文本的左上角 y 坐标位置 */
  y: Double): Unit = js.native
  def fillText(
    /** 在画布上输出的文本 */
  text: String,
    /** 绘制文本的左上角 x 坐标位置 */
  x: Double,
    /** 绘制文本的左上角 y 坐标位置 */
  y: Double,
    /** 需要绘制的最大宽度，可选 */
  maxWidth: Double
  ): Unit = js.native
  /** [CanvasContext.lineTo(number x, number y)](CanvasContext.lineTo.md)
  *
  * 增加一个新点，然后创建一条从上次指定点到目标点的线。用 `stroke` 方法来画线条
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.moveTo(10, 10)
  ctx.rect(10, 10, 100, 50)
  ctx.lineTo(110, 60)
  ctx.stroke()
  ctx.draw()
  ```
  * ![]((canvas/line-to.png)) */
  def lineTo(/** 目标位置的 x 坐标 */
  x: Double, /** 目标位置的 y 坐标 */
  y: Double): Unit = js.native
  /** [Object CanvasContext.measureText(string text)](CanvasContext.measureText.md)
    *
    * 测量文本尺寸信息。目前仅返回文本宽度。同步接口。
    *
    * 最低基础库： `1.9.90` */
  def measureText(/** 要测量的文本 */
  text: String): TextMetrics = js.native
  /** [CanvasContext.moveTo(number x, number y)](CanvasContext.moveTo.md)
  *
  * 把路径移动到画布中的指定点，不创建线条。用 `stroke` 方法来画线条
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.moveTo(10, 10)
  ctx.lineTo(100, 10)
    
  ctx.moveTo(10, 50)
  ctx.lineTo(100, 50)
  ctx.stroke()
  ctx.draw()
  ```
  * ![]((canvas/move-to.png)) */
  def moveTo(/** 目标位置的 x 坐标 */
  x: Double, /** 目标位置的 y 坐标 */
  y: Double): Unit = js.native
  /** [CanvasContext.quadraticCurveTo(number cpx, number cpy, number x, number y)](CanvasContext.quadraticCurveTo.md)
  *
  * 创建二次贝塞尔曲线路径。曲线的起始点为路径中前一个点。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
    
  // Draw points
  ctx.beginPath()
  ctx.arc(20, 20, 2, 0, 2 * Math.PI)
  ctx.setFillStyle('red')
  ctx.fill()
    
  ctx.beginPath()
  ctx.arc(200, 20, 2, 0, 2 * Math.PI)
  ctx.setFillStyle('lightgreen')
  ctx.fill()
    
  ctx.beginPath()
  ctx.arc(20, 100, 2, 0, 2 * Math.PI)
  ctx.setFillStyle('blue')
  ctx.fill()
    
  ctx.setFillStyle('black')
  ctx.setFontSize(12)
    
  // Draw guides
  ctx.beginPath()
  ctx.moveTo(20, 20)
  ctx.lineTo(20, 100)
  ctx.lineTo(200, 20)
  ctx.setStrokeStyle('#AAAAAA')
  ctx.stroke()
    
  // Draw quadratic curve
  ctx.beginPath()
  ctx.moveTo(20, 20)
  ctx.quadraticCurveTo(20, 100, 200, 20)
  ctx.setStrokeStyle('black')
  ctx.stroke()
    
  ctx.draw()
  ```
  *
  * ![]((canvas/quadratic-curve-to.png))
  *
  * 针对 moveTo(20, 20) quadraticCurveTo(20, 100, 200, 20) 的三个关键坐标如下：
  *
  * - 红色：起始点(20, 20)
  * - 蓝色：控制点(20, 100)
  * - 绿色：终止点(200, 20) */
  def quadraticCurveTo(
    /** 贝塞尔控制点的 x 坐标 */
  cpx: Double,
    /** 贝塞尔控制点的 y 坐标 */
  cpy: Double,
    /** 结束点的 x 坐标 */
  x: Double,
    /** 结束点的 y 坐标 */
  y: Double
  ): Unit = js.native
  /** [CanvasContext.rect(number x, number y, number width, number height)](CanvasContext.rect.md)
  *
  * 创建一个矩形路径。需要用 [`fill`](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.fill.html) 或者 [`stroke`](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.stroke.html) 方法将矩形真正的画到 `canvas` 中
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.rect(10, 10, 150, 75)
  ctx.setFillStyle('red')
  ctx.fill()
  ctx.draw()
  ```
  * ![]((canvas/fill-rect.png)) */
  def rect(
    /** 矩形路径左上角的横坐标 */
  x: Double,
    /** 矩形路径左上角的横坐标 */
  y: Double,
    /** 矩形路径的宽度 */
  width: Double,
    /** 矩形路径的高度 */
  height: Double
  ): Unit = js.native
  /** [CanvasContext.restore()](CanvasContext.restore.md)
  *
  * 恢复之前保存的绘图上下文。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
    
  // save the default fill style
  ctx.save()
  ctx.setFillStyle('red')
  ctx.fillRect(10, 10, 150, 100)
    
  // restore to the previous saved state
  ctx.restore()
  ctx.fillRect(50, 50, 150, 100)
    
  ctx.draw()
  ```
  * ![]((canvas/save-restore.png)) */
  def restore(): Unit = js.native
  /** [CanvasContext.rotate(number rotate)](CanvasContext.rotate.md)
  *
  * 以原点为中心顺时针旋转当前坐标轴。多次调用旋转的角度会叠加。原点可以用 `translate` 方法修改。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
    
  ctx.strokeRect(100, 10, 150, 100)
  ctx.rotate(20 * Math.PI / 180)
  ctx.strokeRect(100, 10, 150, 100)
  ctx.rotate(20 * Math.PI / 180)
  ctx.strokeRect(100, 10, 150, 100)
    
  ctx.draw()
  ```
  * ![]((canvas/rotate.png)) */
  def rotate(/** 旋转角度，以弧度计 degrees * Math.PI/180；degrees 范围为 0-360 */
  rotate: Double): Unit = js.native
  /** [CanvasContext.save()](CanvasContext.save.md)
  *
  * 保存绘图上下文。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
    
  // save the default fill style
  ctx.save()
  ctx.setFillStyle('red')
  ctx.fillRect(10, 10, 150, 100)
    
  // restore to the previous saved state
  ctx.restore()
  ctx.fillRect(50, 50, 150, 100)
    
  ctx.draw()
  ```
  * ![]((canvas/save-restore.png)) */
  def save(): Unit = js.native
  /** [CanvasContext.scale(number scaleWidth, number scaleHeight)](CanvasContext.scale.md)
  *
  * 在调用后，之后创建的路径其横纵坐标会被缩放。多次调用倍数会相乘。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
    
  ctx.strokeRect(10, 10, 25, 15)
  ctx.scale(2, 2)
  ctx.strokeRect(10, 10, 25, 15)
  ctx.scale(2, 2)
  ctx.strokeRect(10, 10, 25, 15)
    
  ctx.draw()
  ```
  * ![]((canvas/scale.png)) */
  def scale(
    /** 横坐标缩放的倍数 (1 = 100%，0.5 = 50%，2 = 200%) */
  scaleWidth: Double,
    /** 纵坐标轴缩放的倍数 (1 = 100%，0.5 = 50%，2 = 200%) */
  scaleHeight: Double
  ): Unit = js.native
  /** [CanvasContext.setFillStyle([Color](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/Color.html) color)](CanvasContext.setFillStyle.md)
  *
  * 设置填充色。
  *
  * **代码示例**
  *
  *
  * ```js
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.setFillStyle('red')
  ctx.fillRect(10, 10, 150, 75)
  ctx.draw()
  ```
  * ![]((canvas/fill-rect.png)) */
  def setFillStyle(
    /** [Color](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/Color.html)
    *
    * 填充的颜色，默认颜色为 black。 */
  color: Color
  ): Unit = js.native
  /** [CanvasContext.setFontSize(number fontSize)](CanvasContext.setFontSize.md)
  *
  * 设置字体的字号
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
    
  ctx.setFontSize(20)
  ctx.fillText('20', 20, 20)
  ctx.setFontSize(30)
  ctx.fillText('30', 40, 40)
  ctx.setFontSize(40)
  ctx.fillText('40', 60, 60)
  ctx.setFontSize(50)
  ctx.fillText('50', 90, 90)
    
  ctx.draw()
  ```
  * ![]((canvas/font-size.png)) */
  def setFontSize(/** 字体的字号 */
  fontSize: Double): Unit = js.native
  /** [CanvasContext.setGlobalAlpha(number alpha)](CanvasContext.setGlobalAlpha.md)
  *
  * 设置全局画笔透明度。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
    
  ctx.setFillStyle('red')
  ctx.fillRect(10, 10, 150, 100)
  ctx.setGlobalAlpha(0.2)
  ctx.setFillStyle('blue')
  ctx.fillRect(50, 50, 150, 100)
  ctx.setFillStyle('yellow')
  ctx.fillRect(100, 100, 150, 100)
    
  ctx.draw()
  ```
  * ![]((canvas/global-alpha.png)) */
  def setGlobalAlpha(/** 透明度。范围 0-1，0 表示完全透明，1 表示完全不透明。 */
  alpha: Double): Unit = js.native
  /** [CanvasContext.setLineCap(string lineCap)](CanvasContext.setLineCap.md)
  *
  * 设置线条的端点样式
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.beginPath()
  ctx.moveTo(10, 10)
  ctx.lineTo(150, 10)
  ctx.stroke()
    
  ctx.beginPath()
  ctx.setLineCap('butt')
  ctx.setLineWidth(10)
  ctx.moveTo(10, 30)
  ctx.lineTo(150, 30)
  ctx.stroke()
    
  ctx.beginPath()
  ctx.setLineCap('round')
  ctx.setLineWidth(10)
  ctx.moveTo(10, 50)
  ctx.lineTo(150, 50)
  ctx.stroke()
    
  ctx.beginPath()
  ctx.setLineCap('square')
  ctx.setLineWidth(10)
  ctx.moveTo(10, 70)
  ctx.lineTo(150, 70)
  ctx.stroke()
    
  ctx.draw()
  ```
  * ![]((canvas/line-cap.png)) */
  def setLineCap(/** 线条的结束端点样式 */
  lineCap: String): Unit = js.native
  /** [CanvasContext.setLineDash(Array.<number> pattern, number offset)](CanvasContext.setLineDash.md)
  *
  * 设置虚线样式。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
    
  ctx.setLineDash([10, 20], 5);
    
  ctx.beginPath();
  ctx.moveTo(0,100);
  ctx.lineTo(400, 100);
  ctx.stroke();
    
  ctx.draw()
  ```
  * ![]((canvas/set-line-dash.png))
  *
  * 最低基础库： `1.6.0` */
  def setLineDash(/** 一组描述交替绘制线段和间距（坐标空间单位）长度的数字 */
  pattern: Array[Double], /** 虚线偏移量 */
  offset: Double): Unit = js.native
  /** [CanvasContext.setLineJoin(string lineJoin)](CanvasContext.setLineJoin.md)
  *
  * 设置线条的交点样式
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.beginPath()
  ctx.moveTo(10, 10)
  ctx.lineTo(100, 50)
  ctx.lineTo(10, 90)
  ctx.stroke()
    
  ctx.beginPath()
  ctx.setLineJoin('bevel')
  ctx.setLineWidth(10)
  ctx.moveTo(50, 10)
  ctx.lineTo(140, 50)
  ctx.lineTo(50, 90)
  ctx.stroke()
    
  ctx.beginPath()
  ctx.setLineJoin('round')
  ctx.setLineWidth(10)
  ctx.moveTo(90, 10)
  ctx.lineTo(180, 50)
  ctx.lineTo(90, 90)
  ctx.stroke()
    
  ctx.beginPath()
  ctx.setLineJoin('miter')
  ctx.setLineWidth(10)
  ctx.moveTo(130, 10)
  ctx.lineTo(220, 50)
  ctx.lineTo(130, 90)
  ctx.stroke()
    
  ctx.draw()
  ```
  * ![]((canvas/line-join.png)) */
  def setLineJoin(/** 线条的结束交点样式 */
  lineJoin: String): Unit = js.native
  /** [CanvasContext.setLineWidth(number lineWidth)](CanvasContext.setLineWidth.md)
  *
  * 设置线条的宽度
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.beginPath()
  ctx.moveTo(10, 10)
  ctx.lineTo(150, 10)
  ctx.stroke()
    
  ctx.beginPath()
  ctx.setLineWidth(5)
  ctx.moveTo(10, 30)
  ctx.lineTo(150, 30)
  ctx.stroke()
    
  ctx.beginPath()
  ctx.setLineWidth(10)
  ctx.moveTo(10, 50)
  ctx.lineTo(150, 50)
  ctx.stroke()
    
  ctx.beginPath()
  ctx.setLineWidth(15)
  ctx.moveTo(10, 70)
  ctx.lineTo(150, 70)
  ctx.stroke()
    
  ctx.draw()
  ```
  *
  * ![]((canvas/line-width.png)) */
  def setLineWidth(/** 线条的宽度，单位px */
  lineWidth: Double): Unit = js.native
  /** [CanvasContext.setMiterLimit(number miterLimit)](CanvasContext.setMiterLimit.md)
  *
  * 设置最大斜接长度。斜接长度指的是在两条线交汇处内角和外角之间的距离。当 [CanvasContext.setLineJoin()](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.setLineJoin.html) 为 miter 时才有效。超过最大倾斜长度的，连接处将以 lineJoin 为 bevel 来显示。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.beginPath()
  ctx.setLineWidth(10)
  ctx.setLineJoin('miter')
  ctx.setMiterLimit(1)
  ctx.moveTo(10, 10)
  ctx.lineTo(100, 50)
  ctx.lineTo(10, 90)
  ctx.stroke()
    
  ctx.beginPath()
  ctx.setLineWidth(10)
  ctx.setLineJoin('miter')
  ctx.setMiterLimit(2)
  ctx.moveTo(50, 10)
  ctx.lineTo(140, 50)
  ctx.lineTo(50, 90)
  ctx.stroke()
    
  ctx.beginPath()
  ctx.setLineWidth(10)
  ctx.setLineJoin('miter')
  ctx.setMiterLimit(3)
  ctx.moveTo(90, 10)
  ctx.lineTo(180, 50)
  ctx.lineTo(90, 90)
  ctx.stroke()
    
  ctx.beginPath()
  ctx.setLineWidth(10)
  ctx.setLineJoin('miter')
  ctx.setMiterLimit(4)
  ctx.moveTo(130, 10)
  ctx.lineTo(220, 50)
  ctx.lineTo(130, 90)
  ctx.stroke()
    
  ctx.draw()
  ```
  * ![]((canvas/miter-limit.png)) */
  def setMiterLimit(/** 最大斜接长度 */
  miterLimit: Double): Unit = js.native
  /** [CanvasContext.setShadow(number offsetX, number offsetY, number blur, string color)](CanvasContext.setShadow.md)
  *
  * 设定阴影样式。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.setFillStyle('red')
  ctx.setShadow(10, 50, 50, 'blue')
  ctx.fillRect(10, 10, 150, 75)
  ctx.draw()
  ```
  * ![]((canvas/shadow.png)) */
  def setShadow(
    /** 阴影相对于形状在水平方向的偏移，默认值为 0。 */
  offsetX: Double,
    /** 阴影相对于形状在竖直方向的偏移，默认值为 0。 */
  offsetY: Double,
    /** 阴影的模糊级别，数值越大越模糊。范围 0- 100。，默认值为 0。 */
  blur: Double,
    /** 阴影的颜色。默认值为 black。 */
  color: String
  ): Unit = js.native
  /** [CanvasContext.setStrokeStyle([Color](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/Color.html) color)](CanvasContext.setStrokeStyle.md)
  *
  * 设置描边颜色。
  *
  * **代码示例**
  *
  *
  * ```js
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.setStrokeStyle('red')
  ctx.strokeRect(10, 10, 150, 75)
  ctx.draw()
  ```
  * ![]((canvas/stroke-rect.png)) */
  def setStrokeStyle(
    /** [Color](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/Color.html)
    *
    * 描边的颜色，默认颜色为 black。 */
  color: Color
  ): Unit = js.native
  /** [CanvasContext.setTextAlign(string align)](CanvasContext.setTextAlign.md)
  *
  * 设置文字的对齐
  *
  * **示例代码**
  *
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
    
  ctx.setStrokeStyle('red')
  ctx.moveTo(150, 20)
  ctx.lineTo(150, 170)
  ctx.stroke()
    
  ctx.setFontSize(15)
  ctx.setTextAlign('left')
  ctx.fillText('textAlign=left', 150, 60)
    
  ctx.setTextAlign('center')
  ctx.fillText('textAlign=center', 150, 80)
    
  ctx.setTextAlign('right')
  ctx.fillText('textAlign=right', 150, 100)
    
  ctx.draw()
  ```
  *
  * ![]((canvas/set-text-align.png))
  *
  * 最低基础库： `1.1.0` */
  def setTextAlign(/** 文字的对齐方式 */
  align: String): Unit = js.native
  /** [CanvasContext.setTextBaseline(string textBaseline)](CanvasContext.setTextBaseline.md)
  *
  * 设置文字的竖直对齐
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
    
  ctx.setStrokeStyle('red')
  ctx.moveTo(5, 75)
  ctx.lineTo(295, 75)
  ctx.stroke()
    
  ctx.setFontSize(20)
    
  ctx.setTextBaseline('top')
  ctx.fillText('top', 5, 75)
    
  ctx.setTextBaseline('middle')
  ctx.fillText('middle', 50, 75)
    
  ctx.setTextBaseline('bottom')
  ctx.fillText('bottom', 120, 75)
    
  ctx.setTextBaseline('normal')
  ctx.fillText('normal', 200, 75)
    
  ctx.draw()
  ```
  * ![]((canvas/set-text-baseline.png))
  *
  * 最低基础库： `1.4.0` */
  def setTextBaseline(/** 文字的竖直对齐方式 */
  textBaseline: String): Unit = js.native
  /** [CanvasContext.setTransform(number scaleX, number scaleY, number skewX, number skewY, number translateX, number translateY)](CanvasContext.setTransform.md)
    *
    * 使用矩阵重新设置（覆盖）当前变换的方法
    *
    * 最低基础库： `1.9.90` */
  def setTransform(
    /** 水平缩放 */
  scaleX: Double,
    /** 垂直缩放 */
  scaleY: Double,
    /** 水平倾斜 */
  skewX: Double,
    /** 垂直倾斜 */
  skewY: Double,
    /** 水平移动 */
  translateX: Double,
    /** 垂直移动 */
  translateY: Double
  ): Unit = js.native
  /** [CanvasContext.stroke()](CanvasContext.stroke.md)
  *
  * 画出当前路径的边框。默认颜色色为黑色。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.moveTo(10, 10)
  ctx.lineTo(100, 10)
  ctx.lineTo(100, 100)
  ctx.stroke()
  ctx.draw()
  ```
  * ![]((canvas/stroke-line.png))
  *
  * stroke() 描绘的的路径是从 beginPath() 开始计算，但是不会将 strokeRect() 包含进去。
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  // begin path
  ctx.rect(10, 10, 100, 30)
  ctx.setStrokeStyle('yellow')
  ctx.stroke()
    
  // begin another path
  ctx.beginPath()
  ctx.rect(10, 40, 100, 30)
    
  // only stoke this rect, not in current path
  ctx.setStrokeStyle('blue')
  ctx.strokeRect(10, 70, 100, 30)
    
  ctx.rect(10, 100, 100, 30)
    
  // it will stroke current path
  ctx.setStrokeStyle('red')
  ctx.stroke()
  ctx.draw()
  ```
  *
  * ![]((canvas/stroke-path.png)) */
  def stroke(): Unit = js.native
  /** [CanvasContext.strokeRect(number x, number y, number width, number height)](CanvasContext.strokeRect.md)
  *
  * 画一个矩形(非填充)。 用 [`setStrokeStyle`](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.setStrokeStyle.html) 设置矩形线条的颜色，如果没设置默认是黑色。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.setStrokeStyle('red')
  ctx.strokeRect(10, 10, 150, 75)
  ctx.draw()
  ```
  * ![]((canvas/stroke-rect.png)) */
  def strokeRect(
    /** 矩形路径左上角的横坐标 */
  x: Double,
    /** 矩形路径左上角的横坐标 */
  y: Double,
    /** 矩形路径的宽度 */
  width: Double,
    /** 矩形路径的高度 */
  height: Double
  ): Unit = js.native
  /** [CanvasContext.strokeText(string text, number x, number y, number maxWidth)](CanvasContext.strokeText.md)
    *
    * 给定的 (x, y) 位置绘制文本描边的方法
    *
    * 最低基础库： `1.9.90` */
  def strokeText(/** 要绘制的文本 */
  text: String, /** 文本起始点的 x 轴坐标 */
  x: Double, /** 文本起始点的 y 轴坐标 */
  y: Double): Unit = js.native
  def strokeText(
    /** 要绘制的文本 */
  text: String,
    /** 文本起始点的 x 轴坐标 */
  x: Double,
    /** 文本起始点的 y 轴坐标 */
  y: Double,
    /** 需要绘制的最大宽度，可选 */
  maxWidth: Double
  ): Unit = js.native
  /** [CanvasContext.transform(number scaleX, number scaleY, number skewX, number skewY, number translateX, number translateY)](CanvasContext.transform.md)
    *
    * 使用矩阵多次叠加当前变换的方法
    *
    * 最低基础库： `1.9.90` */
  def transform(
    /** 水平缩放 */
  scaleX: Double,
    /** 垂直缩放 */
  scaleY: Double,
    /** 水平倾斜 */
  skewX: Double,
    /** 垂直倾斜 */
  skewY: Double,
    /** 水平移动 */
  translateX: Double,
    /** 垂直移动 */
  translateY: Double
  ): Unit = js.native
  /** [CanvasContext.translate(number x, number y)](CanvasContext.translate.md)
  *
  * 对当前坐标系的原点 (0, 0) 进行变换。默认的坐标系原点为页面左上角。
  *
  * **示例代码**
  *
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
    
  ctx.strokeRect(10, 10, 150, 100)
  ctx.translate(20, 20)
  ctx.strokeRect(10, 10, 150, 100)
  ctx.translate(20, 20)
  ctx.strokeRect(10, 10, 150, 100)
    
  ctx.draw()
  ```
  *
  * ![]((canvas/translate.png)) */
  def translate(/** 水平坐标平移量 */
  x: Double, /** 竖直坐标平移量 */
  y: Double): Unit = js.native
}

