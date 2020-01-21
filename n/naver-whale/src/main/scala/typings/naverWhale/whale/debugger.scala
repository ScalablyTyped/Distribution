package typings.naverWhale.whale

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 특정 탭의 네트워크 통신, JavaScript 디버깅, DOM · CSS 변형 등 디버그를 위한 [원격 디버깅 프로토콜](https://chromedevtools.github.io/devtools-protocol/tot/Network)을 사용할 수 있습니다.
  * `sendCommand()` 메소드와 `onEvent` 핸들러 함수를 이용해 개발자도구에서 제공하는 개별 기능을 명령 단위로 수행할 수 있습니다.
  * 권한: "debugger"
  * @since Chrome 18.
  */
@JSGlobal("whale._debugger")
@js.native
object debugger
  extends TopLevel[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof chrome.debugger */ js.Any
    ]

