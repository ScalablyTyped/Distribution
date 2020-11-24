package typings.nextReduxWrapper.anon

import typings.next.mod.GetStaticProps
import typings.nextReduxWrapper.mod.GetServerSidePropsContext
import typings.nextReduxWrapper.mod.GetStaticPropsContext
import typings.node.querystringMod.ParsedUrlQuery
import typings.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetServerSideProps[S /* <: js.Object */, A /* <: Action[_] */] extends js.Object {
  
  def getServerSideProps[P /* <: js.Object */](callback: js.Function1[/* context */ GetServerSidePropsContext with (Store[S, A]), Unit | P]): typings.next.mod.GetServerSideProps[P, ParsedUrlQuery] = js.native
  
  def getStaticProps[P_1 /* <: js.Object */](callback: js.Function1[/* context */ GetStaticPropsContext with (Store[S, A]), Unit | P_1]): GetStaticProps[P_1, ParsedUrlQuery] = js.native
  
  def withRedux(Component: js.Any): FunctionComponentWrapperP = js.native
}
object GetServerSideProps {
  
  @scala.inline
  def apply[S /* <: js.Object */, A /* <: Action[_] */](
    getServerSideProps: js.Function1[/* context */ GetServerSidePropsContext with (Store[S, A]), Unit | js.Any] => typings.next.mod.GetServerSideProps[js.Any, ParsedUrlQuery],
    getStaticProps: js.Function1[/* context */ GetStaticPropsContext with (Store[S, A]), Unit | js.Any] => GetStaticProps[js.Any, ParsedUrlQuery],
    withRedux: js.Any => FunctionComponentWrapperP
  ): GetServerSideProps[S, A] = {
    val __obj = js.Dynamic.literal(getServerSideProps = js.Any.fromFunction1(getServerSideProps), getStaticProps = js.Any.fromFunction1(getStaticProps), withRedux = js.Any.fromFunction1(withRedux))
    __obj.asInstanceOf[GetServerSideProps[S, A]]
  }
  
  @scala.inline
  implicit class GetServerSidePropsOps[Self <: GetServerSideProps[_, _], S /* <: js.Object */, A /* <: Action[_] */] (val x: Self with (GetServerSideProps[S, A])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetServerSideProps(
      value: js.Function1[/* context */ GetServerSidePropsContext with (Store[S, A]), Unit | js.Any] => typings.next.mod.GetServerSideProps[js.Any, ParsedUrlQuery]
    ): Self = this.set("getServerSideProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetStaticProps(
      value: js.Function1[/* context */ GetStaticPropsContext with (Store[S, A]), Unit | js.Any] => GetStaticProps[js.Any, ParsedUrlQuery]
    ): Self = this.set("getStaticProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithRedux(value: js.Any => FunctionComponentWrapperP): Self = this.set("withRedux", js.Any.fromFunction1(value))
  }
}
