package typings.minappEnv

import org.scalablytyped.runtime.StringDictionary
import typings.minappEnv.minappEnvStrings.button
import typings.minappEnv.minappEnvStrings.menu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Page {
  
  type GetCurrentPages = js.Function0[Array[(PageInstance[js.Object, js.Object]) & js.Object]]
  
  trait ICustomShareContent extends StObject {
    
    /** 自定义图片路径，可以是本地文件路径、代码包文件路径或者网络图片路径。支持PNG及JPG。显示图片长宽比是 5:4，最低基础库： `1.5.0`。默认值：使用默认截图 */
    var imageUrl: js.UndefOr[java.lang.String] = js.undefined
    
    /** 转发路径，必须是以 / 开头的完整路径。默认值：当前页面 path */
    var path: js.UndefOr[java.lang.String] = js.undefined
    
    /** 转发标题。默认值：当前小程序名称 */
    var title: js.UndefOr[java.lang.String] = js.undefined
  }
  object ICustomShareContent {
    
    @scala.inline
    def apply(): ICustomShareContent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICustomShareContent]
    }
    
    @scala.inline
    implicit class ICustomShareContentMutableBuilder[Self <: ICustomShareContent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImageUrl(value: java.lang.String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      @scala.inline
      def setPath(value: java.lang.String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setTitle(value: java.lang.String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait IPageScrollOption extends StObject {
    
    /** 页面在垂直方向已滚动的距离（单位px） */
    var scrollTop: Double
  }
  object IPageScrollOption {
    
    @scala.inline
    def apply(scrollTop: Double): IPageScrollOption = {
      val __obj = js.Dynamic.literal(scrollTop = scrollTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPageScrollOption]
    }
    
    @scala.inline
    implicit class IPageScrollOptionMutableBuilder[Self <: IPageScrollOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    }
  }
  
  trait IShareAppMessageOption extends StObject {
    
    /** 转发事件来源。
      *
      * 可选值：
      * - `button`：页面内转发按钮；
      * - `menu`：右上角转发菜单。
      *
      * 最低基础库： `1.2.4`
      */
    var from: button | menu | java.lang.String
    
    /** 如果 `from` 值是 `button`，则 `target` 是触发这次转发事件的 `button`，否则为 `undefined`
      *
      * 最低基础库： `1.2.4` */
    var target: js.Any
    
    /** 页面中包含`<web-view>`组件时，返回当前`<web-view>`的url
      *
      * 最低基础库： `1.6.4`
      */
    var webViewUrl: js.UndefOr[java.lang.String] = js.undefined
  }
  object IShareAppMessageOption {
    
    @scala.inline
    def apply(from: button | menu | java.lang.String, target: js.Any): IShareAppMessageOption = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IShareAppMessageOption]
    }
    
    @scala.inline
    implicit class IShareAppMessageOptionMutableBuilder[Self <: IShareAppMessageOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: button | menu | java.lang.String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebViewUrl(value: java.lang.String): Self = StObject.set(x, "webViewUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebViewUrlUndefined: Self = StObject.set(x, "webViewUrl", js.undefined)
    }
  }
  
  trait ITabItemTapOption extends StObject {
    
    /** 被点击tabItem的序号，从0开始，最低基础库： `1.9.0` */
    var index: java.lang.String
    
    /** 被点击tabItem的页面路径，最低基础库： `1.9.0` */
    var pagePath: java.lang.String
    
    /** 被点击tabItem的按钮文字，最低基础库： `1.9.0` */
    var text: java.lang.String
  }
  object ITabItemTapOption {
    
    @scala.inline
    def apply(index: java.lang.String, pagePath: java.lang.String, text: java.lang.String): ITabItemTapOption = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], pagePath = pagePath.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITabItemTapOption]
    }
    
    @scala.inline
    implicit class ITabItemTapOptionMutableBuilder[Self <: ITabItemTapOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: java.lang.String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagePath(value: java.lang.String): Self = StObject.set(x, "pagePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: java.lang.String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  type PageConstructor = js.Function1[
    /* options */ (PageInstance[IAnyObject, IAnyObject & (PageInstance[js.Any, js.Any])]) & IAnyObject & (PageInstance[js.Any, js.Any]), 
    Unit
  ]
  
  trait PageInstance[D /* <: IAnyObject */, T /* <: IAnyObject */]
    extends StObject
       with PageInstanceBaseProps[D] {
    
    /** 生命周期回调—监听页面隐藏
      *
      * 页面隐藏/切入后台时触发。 如 `navigateTo` 或底部 `tab` 切换到其他页面，小程序切入后台等。
      */
    var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** 生命周期回调—监听页面加载
      *
      * 页面加载时触发。一个页面只会调用一次，可以在 onLoad 的参数中获取打开当前页面路径中的参数。
      */
    var onLoad: js.UndefOr[js.Function1[/* query */ js.UndefOr[StringDictionary[java.lang.String]], Unit]] = js.undefined
    
    /** 页面滚动触发事件的处理函数
      *
      * 监听用户滑动页面事件。
      */
    var onPageScroll: js.UndefOr[js.Function1[/* options */ js.UndefOr[IPageScrollOption], Unit]] = js.undefined
    
    /** 监听用户下拉动作
      *
      * 监听用户下拉刷新事件。
      * - 需要在`app.json`的`window`选项中或页面配置中开启`enablePullDownRefresh`。
      * - 可以通过`wx.startPullDownRefresh`触发下拉刷新，调用后触发下拉刷新动画，效果与用户手动下拉刷新一致。
      * - 当处理完数据刷新后，`wx.stopPullDownRefresh`可以停止当前页面的下拉刷新。
      */
    var onPullDownRefresh: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** 页面上拉触底事件的处理函数
      *
      * 监听用户上拉触底事件。
      * - 可以在`app.json`的`window`选项中或页面配置中设置触发距离`onReachBottomDistance`。
      * - 在触发距离内滑动期间，本事件只会被触发一次。
      */
    var onReachBottom: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** 生命周期回调—监听页面初次渲染完成
      * 
      * 页面初次渲染完成时触发。一个页面只会调用一次，代表页面已经准备妥当，可以和视图层进行交互。
      * 
      
      * 注意：对界面内容进行设置的 API 如`wx.setNavigationBarTitle`，请在`onReady`之后进行。
      */
    var onReady: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** 用户点击右上角转发
      *
      * 监听用户点击页面内转发按钮（`<button>` 组件 `open-type="share"`）或右上角菜单“转发”按钮的行为，并自定义转发内容。
      *
      * **注意：只有定义了此事件处理函数，右上角菜单才会显示“转发”按钮**
      *
      * 此事件需要 return 一个 Object，用于自定义转发内容
      */
    var onShareAppMessage: js.UndefOr[
        js.Function1[/* options */ js.UndefOr[IShareAppMessageOption], ICustomShareContent]
      ] = js.undefined
    
    /** 生命周期回调—监听页面显示
      *
      * 页面显示/切入前台时触发。
      */
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** 当前是 tab 页时，点击 tab 时触发，最低基础库： `1.9.0` */
    var onTabItemTap: js.UndefOr[js.Function1[/* options */ js.UndefOr[ITabItemTapOption], Unit]] = js.undefined
    
    /** 生命周期回调—监听页面卸载
      *
      * 页面卸载时触发。如`redirectTo`或`navigateBack`到其他页面时。
      */
    var onUnload: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object PageInstance {
    
    @scala.inline
    def apply[D /* <: IAnyObject */, T /* <: IAnyObject */](): PageInstance[D, T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageInstance[D, T]]
    }
    
    @scala.inline
    implicit class PageInstanceMutableBuilder[Self <: PageInstance[?, ?], D /* <: IAnyObject */, T /* <: IAnyObject */] (val x: Self & (PageInstance[D, T])) extends AnyVal {
      
      @scala.inline
      def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      @scala.inline
      def setOnLoad(value: /* query */ js.UndefOr[StringDictionary[java.lang.String]] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnPageScroll(value: /* options */ js.UndefOr[IPageScrollOption] => Unit): Self = StObject.set(x, "onPageScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPageScrollUndefined: Self = StObject.set(x, "onPageScroll", js.undefined)
      
      @scala.inline
      def setOnPullDownRefresh(value: () => Unit): Self = StObject.set(x, "onPullDownRefresh", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPullDownRefreshUndefined: Self = StObject.set(x, "onPullDownRefresh", js.undefined)
      
      @scala.inline
      def setOnReachBottom(value: () => Unit): Self = StObject.set(x, "onReachBottom", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnReachBottomUndefined: Self = StObject.set(x, "onReachBottom", js.undefined)
      
      @scala.inline
      def setOnReady(value: () => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      @scala.inline
      def setOnShareAppMessage(value: /* options */ js.UndefOr[IShareAppMessageOption] => ICustomShareContent): Self = StObject.set(x, "onShareAppMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnShareAppMessageUndefined: Self = StObject.set(x, "onShareAppMessage", js.undefined)
      
      @scala.inline
      def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setOnTabItemTap(value: /* options */ js.UndefOr[ITabItemTapOption] => Unit): Self = StObject.set(x, "onTabItemTap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTabItemTapUndefined: Self = StObject.set(x, "onTabItemTap", js.undefined)
      
      @scala.inline
      def setOnUnload(value: () => Unit): Self = StObject.set(x, "onUnload", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnUnloadUndefined: Self = StObject.set(x, "onUnload", js.undefined)
    }
  }
  
  trait PageInstanceBaseProps[D /* <: IAnyObject */] extends StObject {
    
    /** 页面的初始数据
      * 
      * `data` 是页面第一次渲染使用的**初始数据**。
      * 
      * 页面加载时，`data` 将会以`JSON`字符串的形式由逻辑层传至渲染层，因此`data`中的数据必须是可以转成`JSON`的类型：字符串，数字，布尔值，对象，数组。
      * 
      * 渲染层可以通过 `WXML` 对数据进行绑定。
      */
    var data: js.UndefOr[D] = js.undefined
    
    /** 到当前页面的路径，类型为`String`。最低基础库： `1.2.0` */
    var route: js.UndefOr[java.lang.String] = js.undefined
    
    /** `setData` 函数用于将数据从逻辑层发送到视图层（异步），同时改变对应的 `this.data` 的值（同步）。
      *
      * **注意：**
      *
      * 1. **直接修改 this.data 而不调用 this.setData 是无法改变页面的状态的，还会造成数据不一致**。
      * 1. 仅支持设置可 JSON 化的数据。
      * 1. 单次设置的数据不能超过1024kB，请尽量避免一次设置过多的数据。
      * 1. 请不要把 data 中任何一项的 value 设为 `undefined` ，否则这一项将不被设置并可能遗留一些潜在问题。
      */
    var setData: js.UndefOr[
        js.Function2[
          /* data */ D | (Pick[D, /* keyof D */ java.lang.String]) | IAnyObject, 
          /* callback */ js.UndefOr[js.Function0[Unit]], 
          Unit
        ]
      ] = js.undefined
  }
  object PageInstanceBaseProps {
    
    @scala.inline
    def apply[D /* <: IAnyObject */](): PageInstanceBaseProps[D] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageInstanceBaseProps[D]]
    }
    
    @scala.inline
    implicit class PageInstanceBasePropsMutableBuilder[Self <: PageInstanceBaseProps[?], D /* <: IAnyObject */] (val x: Self & PageInstanceBaseProps[D]) extends AnyVal {
      
      @scala.inline
      def setData(value: D): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setRoute(value: java.lang.String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
      
      @scala.inline
      def setSetData(
        value: (/* data */ D | (Pick[D, /* keyof D */ java.lang.String]) | IAnyObject, /* callback */ js.UndefOr[js.Function0[Unit]]) => Unit
      ): Self = StObject.set(x, "setData", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetDataUndefined: Self = StObject.set(x, "setData", js.undefined)
    }
  }
}
